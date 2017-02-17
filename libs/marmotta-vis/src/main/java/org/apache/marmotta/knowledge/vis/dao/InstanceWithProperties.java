package org.apache.marmotta.knowledge.vis.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import javax.xml.bind.annotation.XmlTransient;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/** 
 * Base class for Node, Network & Graph
 * 
 * @author dglachs
 *
 */
public class InstanceWithProperties extends Instance<NodeType> {
	private Iterable<Property> properties = new HashSet<>();
	/**
	 * used for serialization only
	 * @see InstanceWithProperties#getNamedGraph()
	 * @return named grap
	 */
	public String getGraph() {
		return getNamedGraph();
	}
	public void setGraph(String graph) {
		setNamedGraph(graph);
	}

	/**
	 * @return the properties
	 */
	public Iterable<Property> getProperties() {
		return properties;
	}
	@XmlTransient
	public Set<Property> getPropertySet() {
		final Set<Property> propSet = new HashSet<>();
		properties.forEach(new Consumer<Property>() {

			/* (non-Javadoc)
			 * @see java.util.function.Consumer#accept(java.lang.Object)
			 */
			@Override
			public void accept(Property t) {
				propSet.add(t);
				
			}
			
		});
		return propSet;

	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Iterable<Property> properties) {
		this.properties = properties;
	}
	@XmlTransient
	public Set<String> getPropertyTypeIds() {
		Set<String> targets = new HashSet<>();
		for ( Property nt : properties ) {
			targets.add(nt.getInstanceType().getId());
		}
		return targets;
	}
	@XmlTransient
	public Property getProperty(String property) {
		for (Property nt : properties) {
			if ( nt.getType().equals(property)) {
				return nt;
			}
		}
		return null;
	}
	/**
	 * Retrieve the properties for a particular type 
	 * @param type
	 * @return
	 */
	@XmlTransient
	public Iterable<Property> getProperties(final String type) {
        return Iterables.filter(
                Iterables.filter(getProperties(), Property.class),
                new Predicate<Property>() {
                    @Override
                    public boolean apply(Property input) {
                    	return input.getType().equals(type);
                    }
                }
        );

	}
	@XmlTransient
	public Set<PropertyType> getPropertyTypes() {
		Set<PropertyType> targets = new HashSet<>();
		for ( Property nt : properties ) {
			targets.add(nt.getInstanceType());
		}
		return targets;
	}

}
