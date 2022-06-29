package com.ansm.rh.service;

/**
 * @author orsys
 *
 */
public class RetraiteServiceImpl implements RetraiteService {

	@Override
	public int getAnneeDepartRetraite(String sexe, int anneeNaissance) {
		
		int anneeDepartRetraite = 0;	
		
		if ("F".equals(sexe)) {
			anneeDepartRetraite = anneeNaissance+60;
		
		} else if ("M".equals(sexe)) {	
			anneeDepartRetraite = anneeNaissance+62;
		} else { }
			// TODO
		return anneeDepartRetraite;
	} 

}
