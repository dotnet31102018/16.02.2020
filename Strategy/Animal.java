package itay;

public abstract class Animal {
	protected String name;

	protected IFly _fly;
	
	public Animal(String name, IFly fly) {
		super();
		this.name = name;
		this._fly = fly; 
	}


	public void Fly()
	{
		_fly.Fly();
	}
	
	public void ChangeFlyAttitude(IFly newStrategy)
	{
		this._fly = newStrategy;
	}
	
	
	public void ChangeFlyAttitude(String name)
	{
		if (name.equals("superman"))
		{
			this._fly = new CanFly();
			return;
		}
		if (name.equals("aquaman"))
		{
			this._fly = new CannotFly();
			return;			
		}
		this._fly = null;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	

}
