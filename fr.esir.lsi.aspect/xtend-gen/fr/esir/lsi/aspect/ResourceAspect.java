package fr.esir.lsi.aspect;

import activity.ResourceType;
import com.google.common.base.Objects;
import exploitation.Ressource;
import fr.esir.lsi.aspect.ResourceAspectRessourceAspectProperties;
import fr.esir.lsi.aspect.Visiteur;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Ressource.class)
@SuppressWarnings("all")
public class ResourceAspect {
  public static Visiteur simulate(final Ressource _self, final Visiteur vist) {
    _self_ = fr.esir.lsi.aspect.ResourceAspectRessourceAspectContext.getSelf(_self);
    	    
    	     return _privk3_simulate(_self,vist); 
  }
  
  public static ResourceAspectRessourceAspectProperties _self_;
  
  protected static Visiteur _privk3_simulate(final Ressource _self, final Visiteur vist) {
    Visiteur _xblockexpression = null;
    {
      ResourceType _resourceType = _self.getResourceType();
      final String type = _resourceType.getName();
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(type, "tracteur")) {
          _matched=true;
          int _tracteur = vist.getTracteur();
          int _plus = (_tracteur + 1);
          vist.setTracteur(_plus);
        }
      }
      if (!_matched) {
        if (Objects.equal(type, "humain")) {
          _matched=true;
          int _humain = vist.getHumain();
          int _plus_1 = (_humain + 1);
          vist.setHumain(_plus_1);
        }
      }
      if (!_matched) {
        new Visiteur();
      }
      _xblockexpression = vist;
    }
    return _xblockexpression;
  }
}
