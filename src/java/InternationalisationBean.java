/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author HAMED
 */
@ManagedBean
@SessionScoped
public class InternationalisationBean {

    /**
     * Creates a new instance of InternationalisationBean
     */
    private String locale;
	private Map<String,Object> countryMap;
    /**
     *
     */
    public InternationalisationBean() {
        countryMap = new LinkedHashMap<String,Object>();
		countryMap.put("English", new Locale("en"));
		countryMap.put("French", new Locale("fr"));
                countryMap.put("Arabic", new Locale("ar"));
    }
    /**
     *
     * @return
     */
    public Map<String, Object> getCountries() {
		return countryMap;
	}
	
	/**
     *
     * @return
     */
    public String getLocale() {
		return locale;
	}
	/**
     *
     * @param locale
     */
    public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
     *
     * @param e
     */
    public void localeChanged(ValueChangeEvent e){
		
		String localeStr = e.getNewValue().toString();		
		
        for (Map.Entry<String, Object> entry : countryMap.entrySet()) {        
        	if(entry.getValue().toString().equals(localeStr)){
				Locale localeA = (Locale)entry.getValue();
        		FacesContext.getCurrentInstance().getViewRoot().setLocale(localeA);        		
        	}
        }
	}
    
}
