package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Attribute;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;

@Ceylon @Attribute
public class infinity {
    
    public static double getInfinity(){
        return Double.POSITIVE_INFINITY;
    }
}
