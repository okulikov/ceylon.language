package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.metadata.SatisfiedTypes;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;

@Ceylon
@TypeParameters(@TypeParameter(value = "Element", variance = Variance.OUT, 
                               satisfies = "ceylon.language.Object"))
@SatisfiedTypes({"ceylon.language.Collection<Element>",
                 "ceylon.language.Cloneable<ceylon.language.Set<Element>>"})
public interface Set<Element> 
        extends Collection<Element> {
    
    @Override
    public long count(java.lang.Object element);

    public boolean superset(@TypeInfo("ceylon.language.Set<ceylon.language.Object>") 
                            @Name("set") Set<? extends java.lang.Object> set);
    
    public boolean subset(@TypeInfo("ceylon.language.Set<ceylon.language.Object>") 
                          @Name("set") Set<? extends java.lang.Object> set);
    
    @Override
    public boolean equals(@Name("that") @TypeInfo("ceylon.language.Object")
    java.lang.Object that);
    
    @Override
    public int hashCode();
    
    @TypeParameters(@TypeParameter(value = "Other", satisfies = "ceylon.language.Object"))
    @TypeInfo("ceylon.language.Set<Element|Other>")
    public <Other> Set<? extends Object> union(@TypeInfo("ceylon.language.Set<Other>") 
                             @Name("set") Set<? extends Other> set);
    
    @TypeParameters(@TypeParameter(value = "Other", satisfies = "ceylon.language.Object"))
    @TypeInfo("ceylon.language.Set<Element&Other>")
    public <Other> Set<? extends Object> intersection(@TypeInfo("ceylon.language.Set<Other>") 
                                    @Name("set") Set<? extends Other> set);

    @TypeParameters(@TypeParameter(value = "Other", satisfies = "ceylon.language.Object"))
    @TypeInfo("ceylon.language.Set<Element|Other>")
    public <Other> Set<? extends Object> exclusiveUnion(@TypeInfo("ceylon.language.Set<Other>") 
                                      @Name("set") Set<? extends Other> set);
    
    @TypeParameters(@TypeParameter(value = "Other", satisfies = "ceylon.language.Object"))
    @TypeInfo("ceylon.language.Set<Element>")
    public <Other> Set<? extends Element> complement(@TypeInfo("ceylon.language.Set<Other>") 
                                      @Name("set") Set<? extends Other> set);

}
