package com.gmail.lizaiatsenko;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-05T16:14:22.539+0200")
@StaticMetamodel(Car.class)
public class Car_ {
	public static volatile SingularAttribute<Car, Long> id;
	public static volatile SingularAttribute<Car, String> name;
	public static volatile SingularAttribute<Car, Date> releaseDate;
	public static volatile SingularAttribute<Car, Float> cost;
}
