package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Attribute;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;

@Ceylon @Attribute
public class $empty {
    private final static Empty value = new Empty() {

        @Override
        public boolean defines(java.lang.Object key) {
            return Correspondence$impl._defines(this, (Integer)key);
        }

        @Override
        public Category getKeys() {
            return Correspondence$impl._getKeys(this);
        }

        @Override
        public boolean definesEvery(Iterable keys) {
            return false;
        }
        @Override
        public boolean definesEvery() {
            return false;
        }

        @Override
        public boolean definesAny(Iterable keys) {
            return false;
        }
        @Override
        public boolean definesAny() {
            return false;
        }

        @Override
        public List<? extends java.lang.Object> items(Iterable keys) {
            return this;
        }
        @Override
        public List<? extends java.lang.Object> items() {
            return this;
        }
        
        @Override
        public boolean containsEvery(ceylon.language.Iterable<?> elements) {
            return Category$impl._containsEvery(this, elements);
        }
        @Override
        public boolean containsEvery() {
            return false;
        }

        @Override
        public boolean containsAny(ceylon.language.Iterable<?> elements) {
            return Category$impl._containsAny(this, elements);
        }
        @Override
        public boolean containsAny() {
            return false;
        }

        @Override
        public long getSize() {
            return Empty$impl._getSize(this);
        }

        @Override
        public boolean getEmpty() {
            return Collection$impl._getEmpty(this);
        }

        @Override
        public Iterator getIterator() {
            return None$impl._getIterator(this);
        }

        @Override
        public java.lang.Object item(Integer key) {
            return Empty$impl._item(this, key);
        }

        @Override
        public java.lang.Object getFirst() {
            return None$impl._getFirst(this);
        }

        @Override
        public java.lang.String toString() {
        	return Empty$impl._toString(this);
        }
        
        @Override
        public boolean contains(java.lang.Object element) {
            return Empty$impl._contains(this, element);
        }

        @Override
        public long count(java.lang.Object element) {
            return Empty$impl._count(this, element);
        }

        @Override
        public Empty getClone() {
            return Empty$impl._getClone(this);
        }

        @Override
        public Integer getLastIndex() {
            return Empty$impl._getLastIndex(this);
        }

        @Override
        public boolean defines(Integer key) {
            return Empty$impl._defines(this, key);
        }
        
        public boolean equals(Object that) {
            return that instanceof List ?
                    ((List) that).getEmpty() : false;
        }
        
        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public java.lang.Object item(java.lang.Object key) {
            return Empty$impl._item(this, key);
        }

        @Override
        public Empty span(Comparable from, Comparable to) {
            return Empty$impl._span(this, (Integer)from, (Integer)to);
        }

        @Override
        public Empty segment(Comparable from, long length) {
            return Empty$impl._segment(this, (Integer)from, length);
        }

    };
    
    public static Empty getEmpty(){
        return value;
    }
    
}