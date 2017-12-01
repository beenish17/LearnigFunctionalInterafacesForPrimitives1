
package functionalinterfacesforprimitives;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;
//  The difference in Functional interfaces for Primitives from Built-in-Functional interfaces :
//  1:Generics are gone from some of interfaces, since the type names tell us which type is involved. In cases ,DoubleFunction,INtFunction -generics are needed.
//  2:Single Abstract method is involved, but not always, renamed in some cases to reflect Primitive type is involved.
//  3:Bi-Consumer,BiFunction,Bi-Predicate are not used in Primitive functional interfaces, and the functions with two different type parameters are also not used in Primitive type Functional interfaces.

public class FunctionalInterfacesForPrimitives {

    public static void main(String[] args) {
        System.out.println("------0-Parameter ----- -as Return Type------  Single Abstract Method");
        DoubleSupplier pi=()->{return 3.147;};      //double                //getAsDouble
        System.out.println(pi.getAsDouble());
        
        IntSupplier in=()->Integer.MIN_VALUE;       //int                   //getAsInteger
        System.out.println(in.getAsInt());
        
        LongSupplier ls=()->Long.MAX_VALUE;         //long                  //getAsLong
        System.out.println(ls.getAsLong());
        
        System.out.println("------1-Parameter -----Void -as Return Type------ accept- Single Abstract Method");
        
        DoubleConsumer db=(x)->System.out.println(x*x);
        db.accept(2);
        
        IntConsumer ic=(x)->System.out.println(x+x);
        ic.accept(3);
        
        LongConsumer lc=(x)->System.out.println(x*2);
        lc.accept(33);
        System.out.println("------1-Parameter -----Boolean -as Return Type------ test- Single Abstract Method");
        
        DoublePredicate dp=(x)-> x>2;
        System.out.println(dp.test(3));
        
        IntPredicate ip=(x)->x<3;
        System.out.println(ip.test(4));
        
        LongPredicate lp=(x)-> x<6;
        System.out.println(lp.test(70));
        System.out.println("------1-Parameter(double) -----Generic -as Return Type------ apply- Single Abstract Method");
        // We can only use Wrapper classes with Geenric types.
        
        DoubleFunction<String> db1=(x)-> x + " is a String now. ";
        System.out.println(db1.apply(23.6));
        
        IntFunction<Integer> iff=(i)->i+5;
        System.out.println(iff.apply(3));
        
        LongFunction lf=(j)->Long.toString(j);
        System.out.println(lf.apply(Long.MAX_VALUE));
        
        System.out.println("------1-Parameter(double) ---- -as Return Type------             Single Abstract Method");
        DoubleUnaryOperator dub=(x)->{return x+x;};         //double                            // applyAsDouble
        System.out.println(dub.applyAsDouble(34));
        
        IntUnaryOperator iuo=(d)->{return d+d;};            //int                               // applyAsInteger
        System.out.println(iuo.applyAsInt(3));
        
        LongUnaryOperator luo=(d)->{return d+d;};           //long                              // applyAsLong
        System.out.println(iuo.applyAsInt(3999999));
        
        System.out.println("------2-Parameter(double) ----- -as Return Type------ applyAsDouble- Single Abstract Method");
       
        DoubleBinaryOperator dbo = (x, y) -> x + y;                   //double                         // applyAsDouble
        System.out.println(dbo.applyAsDouble(23, 45.7));

        IntBinaryOperator ibo = (x, y) -> x * y;                     //int                             // applyAsInteger
        System.out.println(ibo.applyAsInt(22, 44));

        LongBinaryOperator lbo = (x, y) -> x + y;                   //long                             // applyAsLong
        System.out.println(lbo.applyAsLong(3333, 44444));
    }
    
}
