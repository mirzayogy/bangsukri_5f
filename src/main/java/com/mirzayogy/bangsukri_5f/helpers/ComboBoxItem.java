
package com.mirzayogy.bangsukri_5f.helpers;


public class ComboBoxItem {
   int id;
   String item;
   
   public ComboBoxItem(int id, String item){
       this.id=id;
       this.item=item;
   }

    @Override
    public String toString() {
        return this.item;
    }
   
    public int getId(){
      return this.id;
    }
   
}
