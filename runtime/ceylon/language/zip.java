package ceylon.language;

import java.util.ArrayList;
import java.util.List;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Method;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;

@Ceylon
@Method
public final class zip {
    
    private zip() {}
    
    @TypeParameters({@TypeParameter(value="Key", satisfies="ceylon.language.Object"),
                     @TypeParameter(value="Item", satisfies="ceylon.language.Object")})
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<ceylon.language.Entry<Key,Item>>")
    public static <Key,Item> Iterable<? extends Entry<? extends Key, ? extends Item>> zip(
    @Name("keys")
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<Key>")
    final ceylon.language.Iterable<? extends Key> keys,
    @Name("items")
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<Item>")
    final ceylon.language.Iterable<? extends Item> items) {
		List<Entry<? extends Key,? extends Item>> list = new ArrayList<Entry<? extends Key,? extends Item>>();
		Iterator<? extends Key> keyIter = keys.getIterator();
		Iterator<? extends Item> itemIter = items.getIterator();
		Key key = (Key) keyIter.next();
        Item item = (Item) itemIter.next();
		while (key != exhausted.getExhausted() && item != exhausted.getExhausted()) {
			list.add(new Entry<Key,Item>(key, item));
	        key = (Key) keyIter.next();
	        item = (Item) itemIter.next();
		}
        return new ArraySequence<Entry<? extends Key,? extends Item>>(list);
    }
}
