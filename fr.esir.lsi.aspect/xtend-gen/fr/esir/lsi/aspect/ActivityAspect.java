package fr.esir.lsi.aspect;

import activity.Activity;
import exploitation.Atelier;
import exploitation.Culture;
import exploitation.Elevage;
import fr.esir.lsi.aspect.ActivityAspectActivityAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect {
  public static CharSequence simulate(final Activity _self) {
    _self_ = fr.esir.lsi.aspect.ActivityAspectActivityAspectContext.getSelf(_self);
    	    
    	     return _privk3_simulate(_self); 
  }
  
  public static ActivityAspectActivityAspectProperties _self_;
  
  protected static CharSequence _privk3_simulate(final Activity _self) {
    String _xblockexpression = null;
    {
      final EList<Atelier> atelier = _self.getAtelier();
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (atelier instanceof Culture) {
          _matched=true;
          _switchResult = "c";
        }
      }
      if (!_matched) {
        if (atelier instanceof Elevage) {
          _matched=true;
          _switchResult = "b";
        }
      }
      if (!_matched) {
        _switchResult = "a";
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
