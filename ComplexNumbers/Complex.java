
class Complex {

	private float imaginary;
	private float real;
	//No Args Constructor
	public Complex()
	{
		
	}
	
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	
	Complex sum(Complex complex1,Complex complex2)
	{
		Complex csum= new Complex();
		csum.real= complex1.real + complex2.real;
		return csum;
	}
	
		
}
