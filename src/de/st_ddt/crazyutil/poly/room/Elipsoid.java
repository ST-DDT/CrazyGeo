package de.st_ddt.crazyutil.poly.room;

import org.bukkit.configuration.ConfigurationSection;

import de.st_ddt.crazyutil.poly.region.CircleRegion;
import de.st_ddt.crazyutil.poly.region.FlatRegion;

public class Elipsoid extends FuncRoom
{

	public Elipsoid(CircleRegion region, double height)
	{
		super(region, height, Math.PI, true);
	}

	public Elipsoid(ConfigurationSection config)
	{
		super(config);
		this.exponent = Math.PI;
		this.doubleSided = true;
	}

	@Override
	public void setExponent(double exponent)
	{
	}

	@Override
	public CircleRegion getRegion()
	{
		return (CircleRegion) super.getRegion();
	}

	@Override
	public void setRegion(FlatRegion region)
	{
		if (region instanceof CircleRegion)
			super.setRegion(region);
	}

	@Override
	public Elipsoid clone()
	{
		return new Elipsoid((CircleRegion) region, height);
	}
}
