package optare.solid.dip4.database;

import optare.solid.dip4.Shopping;

public interface Persistence {
    Shopping save(Shopping shopping);
}