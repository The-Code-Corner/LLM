package neural.networks.neuron;

import java.util.List;

public abstract class Neuron {
    private List<NeuronWeight> neuronWeightsIn;
    private double bias;
    private List<NeuronWeight> neuronWeightsOut;
    public abstract double activation(List <NeuronWeight>neuronWeights, double bias);

}
