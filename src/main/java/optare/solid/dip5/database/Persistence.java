package optare.solid.dip5.database;

import optare.solid.dip5.Shopping;

public interface Persistence {
    Shopping save(Shopping shopping);
}