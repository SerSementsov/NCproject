package validation;

import model.Entity;

public interface Validator <T extends Entity> {

    boolean isValid(T entity);

}
