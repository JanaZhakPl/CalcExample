package by.tms.service;

import by.tms.entity.Operation;
import by.tms.storage.OperationStorage;

import java.util.List;

public class CalcService {

    private final OperationStorage operationStorage = new OperationStorage();

    public Operation calc(double a, double b, String operand) {
        switch (operand) {
            case "sum": {
                Operation operation = new Operation(a, b, operand, a + b);
                operationStorage.save(operation);
                return operation;
            }
            case "sub": {
                Operation operation = new Operation(a, b, operand, a -b);
                operationStorage.save(operation);
                return operation;
            }
        }
        return null;
    }

    public List<Operation> findAll() {
        return operationStorage.getAll();
    }
}
