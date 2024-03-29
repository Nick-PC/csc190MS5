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
package EvilCraft;

import BridgePattern.ICanvasDevice;
import BridgePattern.IGameEngine;
import BridgePattern.ISoundDevice;
import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class GameEngine implements IGameEngine{
    // -------------- DATA MEBERS ------------------
    protected String mapPath;
    protected ICanvasDevice mainview;
    protected ICanvasDevice minimap;
    protected ISoundDevice soundDevice;
    protected ICanvasDevice buttonCanvas;
    protected static GameEngine ge_instance = null;
    protected ArrayList<Sprite> arrSprites = new ArrayList<Sprite>(); //moving objects
    protected ArrayList<StaticObject> arrMapTiles = new ArrayList<StaticObject>();
    protected ArrayList<Team> arrTeams = new ArrayList<Team>();
    //---------------- OPERATIONS ------------------
    /**
     * Constructor.
     * An evil craft game engine has 3 canvases: main view, mini map and a panel for manufacturing units
     * @param mapPath
     * @param mainview
     * @param minimap
     * @param factoryPanel
     * @param sound 
     */
    public GameEngine(String mapPath, ICanvasDevice mainview, ICanvasDevice minimap, ICanvasDevice factoryPanel, ISoundDevice sound){
        this.mapPath = mapPath;
        this.mainview = mainview;
        this.minimap = minimap;
        this.buttonCanvas = factoryPanel;
        this.soundDevice = soundDevice;
        ge_instance = this;
    }
    
    public static GameEngine getInstance(){
        return ge_instance;
    }

    @Override
    public void init() {
        //DON'T KILL THE following line
        ge_instance  = this;
        //DON'T KILL THE ABOVE LINE
    }

    @Override
    public void onTick() {
        
    }

    @Override
    public void onRightClick(ICanvasDevice canvas, int x, int y) {
        
    }

    @Override
    public void onLeftClick(ICanvasDevice canvas, int x, int y) {
        
    }

    @Override
    public void onRegionSelected(ICanvasDevice canvas, int x1, int y1, int x2, int y2) {
        
    }
    
    /**
     * Load map tils and load them into the arrMapTiles of the GameEngine.
     * Also create the Map object
     * @param mapPath 
     */
    public void loadGameMap(String mapPath){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Return the left top corner of a free space close to (x,y)
     * The requested free space's dimension is (w,h)
     * @param x
     * @param y
     * @param w
     * @param h
     * @return 
     */
    public Point getFreeSpace(int x, int y, int w, int h){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public void addSprite(Sprite s){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public void removeSprite(Sprite s){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * return null if no winner
     * @return 
     */
    public Team CheckWinner(){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    /**
     * Display the message correspondingly
     * @param winner 
     */
    public void endGame(Team winner){
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
}
