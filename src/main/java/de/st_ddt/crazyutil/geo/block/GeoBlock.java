package de.st_ddt.crazyutil.geo.block;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

import de.st_ddt.crazyutil.geo.location.GeoLocation;

public class GeoBlock extends GeoLocation
{

	protected Material material;
	protected byte data;

	// protected BlockState state;
	public GeoBlock(final Block block)
	{
		super(block.getX(), block.getY(), block.getZ());
		material = block.getType();
		data = block.getData();
		// state = block.getState();
	}

	public void apply(final Location target, final boolean physics)
	{
		final Block block = target.clone().add(x, y, z).getBlock();
		block.setTypeIdAndData(material.getId(), data, physics);
	}
}
