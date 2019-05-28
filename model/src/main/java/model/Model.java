package model;

import contract.IHero;

/**
 * The Class Model.
 *
 * @author [enter name]
 */
public class Model implements IModel {

	private IHero hero;
	private IMap map;

	public Model() {

	}

	public IHero getHero() {
		return this.hero;
	}

	public void setHero(IHero hero) {
		this.hero = hero;
	}

	public IMap getMap() {
		return this.map;

	}

	public void setMap(IMap Map) {

	}
}
