

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Panjapoll();
		this.Chananya();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("  Demo  - Krerk Piromsopa, Ph.D.");
    }

    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }
	private void Piyaporn() {
        System.out.println("Trainee - Piyaporn Eiamsakul, Miss");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
	
	private void Chananya() {
        System.out.println("Trainer - Chananya Phugsuwan, SE");
    }
}
