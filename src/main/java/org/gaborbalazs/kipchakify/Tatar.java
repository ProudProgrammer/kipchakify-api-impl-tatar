package org.gaborbalazs.kipchakify;

import java.util.Date;
import java.util.Objects;

public final class Tatar implements Kipchak {

    private final String name;
    private final Date birthdate;

    public Tatar(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tatar tatar = (Tatar) o;
        return Objects.equals(name, tatar.name) &&
                Objects.equals(birthdate, tatar.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);
    }
}
