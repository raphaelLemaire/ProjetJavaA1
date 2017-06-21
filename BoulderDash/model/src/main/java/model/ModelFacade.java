package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;
import model.element.motionfull.MainCharacter;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 */
public class ModelFacade implements IModel {
	
	private Map map;
	
	private IMotionfullElement character;

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade(int level) {
       this.setMap(new Map(level));
       this.setCharacter(new MainCharacter(getMap()));
    }
    
    
	@Override
	public Map getMap() {
		return this.map;
	}
	
	public void setMap(Map map){
		this.map = map;
	}

	@Override
	public IMotionfullElement getCharacter() {
		return this.character;
	}

	public void setCharacter(IMotionfullElement character){
		this.character = character;
	}
	
	
	

}
