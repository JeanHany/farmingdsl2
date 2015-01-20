/**
 *
 * $Id$
 */
package activity.validation;

import activity.Activites;
import activity.Date;
import activity.Periodicite;
import activity.Res_Alloc;
import activity.Rule;

import exploitation.Atelier;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link activity.Activity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityValidator {
	boolean validate();

	boolean validatePeriodicite(Periodicite value);
	boolean validateRes_alloc(EList<Res_Alloc> value);
	boolean validateRule(EList<Rule> value);
	boolean validateFin(Date value);
	boolean validateDebut(Date value);
	boolean validateAtelier(EList<Atelier> value);
	boolean validateActivites(Activites value);

	boolean validateActivités(Activites value);
}