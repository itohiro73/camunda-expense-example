package sample.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import sample.Category;

import java.util.logging.Logger;

public class ExpenseRecorder implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(ExpenseRecorder.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("内容: " + execution.getVariable("detail"));
        LOGGER.info("金額（円）: " + execution.getVariable("amount"));
        LOGGER.info("経費種別: " + Category.valueOf((String)execution.getVariable("expenseCategory")));
        LOGGER.info("承認済み？: " + (((Boolean)execution.getVariable("approved")).booleanValue() ? "はい" : "いいえ"));
    }
}
