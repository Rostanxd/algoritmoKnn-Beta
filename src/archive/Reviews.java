/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archive;

import entities.Columns;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Reviews implements Serializable{
    File colFile = new File("C:\\Users\\HP\\Documents\\Rostan JAVA\\AlgoritmoKNN\\AlgorithmKNN\\config\\columns.txt");
    
    public ArrayList<Columns> readColFile(){
        Scanner sc = null;
        ArrayList<Columns> columns = new ArrayList<Columns>();
        
        try{
            sc = new Scanner(colFile);
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] cutString = line.split("::");
                Columns col = new Columns();
                col.setColumnId(Integer.parseInt(cutString[0]));
                col.setColumnName(cutString[1]);

                columns.add(col);
            }
        }catch(Exception e){
            System.out.println("Error reading the file");
        }
    return columns;
    }
    
    public void writteColumn(int Id, String nameCol){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Columns c = new Columns();
        
        try{
            fos = new FileOutputStream(colFile);
            oos = new ObjectOutputStream(fos);
            c = new Columns(Id,nameCol);
            oos.writeObject(c);
        }catch(FileNotFoundException fe){
            System.out.println(fe.toString());
        }catch(IOException ie){
            System.out.println(ie.toString());
        }finally{
            try{
                if(fos!=null) fos.close();
                if(oos!=null) oos.close();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
    
    public ArrayList<Columns> readColumns(){
        ArrayList<Columns> col = new ArrayList<Columns>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(colFile);
            ois = new ObjectInputStream(fis);
            while (true) {                
                Columns c = new Columns();
                c = (Columns)ois.readObject();
                col.add(c);
            }
        }catch(FileNotFoundException fe){
            System.out.println(fe.toString());
        }catch(ClassNotFoundException ce){
            System.out.println(ce.toString());
        }catch(IOException ie){
            System.out.println(ie.toString());
        }finally{
            try{
                if(fis!=null) fis.close();
                if(ois!=null) ois.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return col;
    }
    
    public void upDateColumns(int Id, String desc){
        ArrayList<Columns> col = readColumns();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(colFile);
            oos = new ObjectOutputStream(fos);
            for (int i = 0; i < col.size(); i++) {
                Columns c = new Columns();
                c = col.get(i);
                oos.writeObject(c);
            }
            Columns c = new Columns();
            c.setColumnId(Id);
            c.setColumnName(desc);
            oos.writeObject(oos);
        }catch(FileNotFoundException fe){
            System.out.println("FileNotFoundException"+fe.toString());
        }catch(IOException ie){
            System.out.println("IOException"+ie.toString());
        }finally{
            try{
                if(fos!=null) fos.close();
                if(oos!=null) oos.close();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
    
}
