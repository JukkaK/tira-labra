package regex.regexparts;

public class REepsilon implements REsubexpAtom{
    
    public REepsilon(){}
    
    @Override
    public REsubexp getLeft() {
        return null;
    }
    
    @Override
    public boolean matches(char c) {
        return false;
    }
    
    @Override
    public boolean matchesEmpty() {
        return true;
    }
    
    @Override
    public REsubexp derivative(char c) {
        return new REnull();
    }
    
}
