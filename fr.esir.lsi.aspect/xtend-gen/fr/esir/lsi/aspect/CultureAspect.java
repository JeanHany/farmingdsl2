package fr.esir.lsi.aspect;

import exploitation.Culture;
import fr.esir.lsi.aspect.CultureAspectCultureAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Culture.class)
@SuppressWarnings("all")
public class CultureAspect {
  public static boolean simulate(final Culture _self) {
    _self_ = fr.esir.lsi.aspect.CultureAspectCultureAspectContext.getSelf(_self);
    	    
    	     return _privk3_simulate(_self); 
  }
  
  public static CultureAspectCultureAspectProperties _self_;
  
  protected static boolean _privk3_simulate(final Culture _self) {
    return true;
  }
}
