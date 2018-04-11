import java.util.*;

public class AI_mani4 { //goal - multiple degree summation (for each layer)
//first -2 degree, second, 1 degree, third, 0 degree

private int numberOfItems;

public AI_mani4(int numOfItems) {
numberOfItems = numOfItems;
}

public boolean train(int[] ins, int[] outs) {//trains the whole network. is initiated as class variable of master class so is in same frame as rest of sub-classes
boolean test = true; //will be returned as false if fails
LayerOne a = new LayerOne(1);
LayerTwo b = new LayerTwo(1);
LayerThree c = new LayerThree(1);

do {
a.genWeights();
b.genWeights();
c.genWeights();
return test;
} while (a.getWeights * ins




public static void main(String[] args) {

AI_mani4 mani = new AI_mani4(3);

LayerOne one = new LayerOne(mani.numberOfItems);
LayerTwo two = new LayerTwo(mani.numberOfItems);
LayerThree three = new LayerThree(mani.numberOfItems);

double dIn = {1,2,3};
double dOut = {2,4,6};

//train the network

do {

one.genWeights(); //gen the weights
two.genWeights();
three.genWeights();

//test the weights

//int[] sum = new int[mani.numberOfItems];
//for (int g = 0; g < 3; g++) { //adds up for layer one, two, and three - #will need multiple case to run whole thing multiple times

int sum = 0;//add up all the weights * data to get sum to total layers

double[] wOne = one.getWeights();
double[] wTwo = two.getWeights();
double[] wThree = three.getWeights();

for (int j = 0; j < mani.numberOfItems; j++)
sum += wOne[j] * dIn[j];
for (int k = 0; k < mani.numberOfItems; k++)
sum += wTwo[j] * dIn[j];
for (int l = 0; l < mani.numberOfItems; l++)
sum += wThree[j] * dIn[j];






}

}

class LayerOne {

private Random rand = new Random();
double[] weight;

public LayerOne(int numOfItems) {
weight = new double[numOfItems];
}

public void genWeights() {//randomly generates the weights
for (int i = 0; i < weight.length; i++) 
weight[i] = 0.0 + (10.0 - 0.0) * rand.nextDouble();
}

public double[] getWeights(){//returns the weights, master class with mult each
return weight;
}

}//end of LayerOne

class LayerTwo {

private Random rand = new Random();
double[] weight;

public LayerTwo(int numOfItems) {
weight = new double[numOfItems];
}

public void genWeights() {//randomly generates the weights
for (int i = 0; i < weight.length; i++) 
weight[i] = 0.0 + (10.0 - 0.0) * rand.nextDouble();
}

public double[] getWeights(){//returns the weights, master class with mult each
return weight;
}

}//end of LayerTwo

class LayerThree {

private Random rand = new Random();
double[] weight;

public LayerThree(int numOfItems) {
weight = new double[numOfItems];
}

public void genWeights() {//randomly generates the weights
for (int i = 0; i < weight.length; i++) 
weight[i] = 0.0 + (10.0 - 0.0) * rand.nextDouble();
}

public double[] getWeights(){//returns the weights, master class with mult each
return weight;
}

}//end of LayerThree

