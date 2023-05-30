interface vol{
    void volu();
}
class sphere implements vol{
    double r;
    sphere(double r){
        this.r=r;
    }
    public void volu(){
        System.out.println("Volume of sphere="+((4.0/3.0) *Math.PI* r*r*r));
    }
}

class cone implements vol{
    
    double r,h;
    
    cone(double r, double h){
        this.r=r;
        this.h=h;
    }

    public void volu(){
        System.out.println("Volume of cone="+((1.0/3.0) * Math.PI * h*r*r));
    }
}

class volume{
    public static void main(String[] args){
        sphere s1= new sphere(4);
        cone c1= new cone(5,6);

        s1.volu();
        c1.volu();
    }
}