import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

import javax.swing.*;

public class Main extends Agent{

    private AgentGUI myGUI;
    protected void setup() {
        myGUI=new AgentGUI(this);
        myGUI.showGui();
    }

    public void sendX(final int x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                int[][] dataset = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};

                OpeRL noc = new OpeRL(dataset);
                noc.Prediccion(x);
            }
        } );
    }

}


