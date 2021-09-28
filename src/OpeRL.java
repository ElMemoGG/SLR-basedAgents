import javax.swing.*;

public class OpeRL {

    private int[][] arr;
    private float xy, x2, xS, yS;

    public OpeRL(int[][] arr) {
        this.arr = arr;
        Calular();
    }
    private void Calular(){
        for (int i = 0; i <arr.length ; i++) {
            yS += arr[i][0];
            xy += arr[i][0] * arr[i][1];
            xS += arr[i][1];
            x2+= arr[i][1]*arr[i][1];
        }
    }

    public float Beta0(){
        return (x2 * yS- xS * xy)/(arr.length * x2 - xS * xS);
    }
    public float Beta1(){return (arr.length * xy - xS *  yS)/(arr.length * x2 - xS * xS);}

    public void Prediccion(int x){
        //JOptionPane.showMessageDialog(null, "y = "+ Beta0() +" + "+ Beta1() +"x\n"+ Beta0() +" + "+ Beta1()  +"(" + x + ") = "+ (Beta0() + Beta1()* x));

        System.out.println("y = "+ Beta0() +" + "+ Beta1() +"x");
        System.out.println(Beta0() +" + "+ Beta1()  +"(" + x + ") = "+ (Beta0() + Beta1()* x));
    }

}
