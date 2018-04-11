import java.util.*;
public class AI_mani2 {

/*
CURRENT STATE

1 degree, works for multiple input nodes

*/

private Random rand = new Random();
double[] weight;

public AI_mani2(int numOfItems) {
weight = new double[numOfItems];
}

public void recieve(double input[], double output[]) {
for(int j = 0; j < weight.length; j++) {//goes through each item training
double w = 0;
double b = output[j] - 1;
while (b != output[j]) {
w = 0.0 + (10.0 - 0.0) * rand.nextDouble();
b = input[j] * w;
b = Math.round(b * 100.0) / 100.0;
}
weight[j] = w;

System.out.println("Success, weight : " + weight[j]);
}
}

public static void main(String[] args) {

AI_mani2 mani = new AI_mani2(3);

double[] in = {1,2,3};
double[] out = {2,4,6};

mani.recieve(in,out);//start with 2x
}

}


