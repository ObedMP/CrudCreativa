package repository;

import javax.inject.Inject;

public class ProductosRepository {
    private final DatabaseExecutionContext executionContext;
    @Inject
    public ProductosRepository(DatabaseExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

}
