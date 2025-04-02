package main.java;
class Corpo_Humano
{
    private float Peso;
    private float Altura;
    private float Massa;

    public Corpo_Humano(float massa, float volume)
    {
        this.Peso = Peso;
        this.Altura= Altura;
        calcularIMC();
    }

    public double calcularIMC(){
        return Peso / (Altura*Altura);
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getMassa() {
        return Massa;
    }

    public void setMassa(float Massa) {
        this.Massa = Massa;
    }

} 
