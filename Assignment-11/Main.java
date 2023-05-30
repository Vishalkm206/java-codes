import mypackage.MyPackageClass;
import mypackage.subpackage.SubPackageClass;

public class Main {

    public static void main(String[] args) {
        MyPackageClass myPackageObject = new MyPackageClass();
        myPackageObject.method1();
        myPackageObject.method2();
        MyPackageClass.staticMethod();

        SubPackageClass subPackageObject = new SubPackageClass();
        subPackageObject.method3();
        subPackageObject.method4();
        SubPackageClass.staticMethod();
    }
}
