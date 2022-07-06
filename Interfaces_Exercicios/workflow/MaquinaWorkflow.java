public class MaquinaWorkflow {

    public void executar(Workflow workflow) {
        workflow.getAtividades().forEach(w -> w.executar());
    }
}
