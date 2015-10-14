/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Columns implements Serializable{
    private int columnId;
    private String columnName;
    
    public Columns(){
        //  VOID
    }
    
    public Columns(int Id, String Name){
        this.columnId = Id;
        this.columnName = Name;
    }

    /**
     * @return the ColumnId
     */
    public int getColumnId() {
        return columnId;
    }

    /**
     * @param ColumnId the ColumnId to set
     */
    public void setColumnId(int ColumnId) {
        this.columnId = ColumnId;
    }

    /**
     * @return the columnName
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName the columnName to set
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
