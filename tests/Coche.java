public class Coche {

    public int velocidad;

    public void acelerar_Jesus(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Jesus(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}
