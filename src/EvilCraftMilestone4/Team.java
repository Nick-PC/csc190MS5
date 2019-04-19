/*
 * Copyright (C) 2019 csc190
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package EvilCraftMilestone4;
import EvilCraft.Base;

/**
 *
 * @author csc190
 */
public class Team {
    //DATA MEMBER DECLARATIONS
    protected int cash;
    protected String name;
    protected String color;
    protected Base myBase;
    public boolean canAfford;
    
    //END DATA MEMBER DECLARATIONS
    
    //FUNCTION DECLARATIONS
    
    //Constructor
    public Team(int cash, String name, String color, Base myBase){
        this.cash=cash;
        this.name=name;
        this.color=color;
        this.myBase=myBase;
    }
    //end Constructor
    
    public boolean checkFunds(int unitPrice){
        return ((cash-unitPrice)>=0);
    }
    
    public void PayForSprite(int unitPrice){
        cash-=unitPrice;
    }
    
    public int getCash(){
        return cash;
    }
    
    public Base getBase(){
        return myBase;
    }
    //END FUNCTION DECLARATIONS
}
