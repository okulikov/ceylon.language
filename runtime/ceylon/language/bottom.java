package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Attribute;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;

@Ceylon @Attribute
public class bottom {
    @TypeInfo("ceylon.language.Bottom")
    public static <T> T getBottom(){
        throw new Exception(null, null);
    }
}