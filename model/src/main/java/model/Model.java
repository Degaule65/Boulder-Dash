package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;

/**
 * The Class Model.
 *
 * @author [enter name]
 */
public final class Model extends Observable implements IModel {


	private IHero hero;
	public int width;
	public int heigth;
	public int STYLE;


	public Model() {
		
	}

	public IHero getHero() {
		return hero;
	}

	public void setHero(IHero hero) {
		this.hero = hero;
	}
	
	public IMap getMap() {
		
	}
	public void setMap(IMap Map) {
		
	}
	
	
}
