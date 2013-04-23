package ControlePK;

import ControlePK.util.JsfUtil;
import ControlePK.util.PaginationHelper;
import EntityPk.Personnel;
import EntityPk.PersonnelLang;
import FacadePK.LangFacade;
import FacadePK.PersonnelFacade;
import FacadePK.PersonnelLangFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@ManagedBean(name = "personnelLangController")
@SessionScoped
public class PersonnelLangController implements Serializable {

    private PersonnelLang current;
    private PersonnelLang currentfr;
    private PersonnelLang currentar;
    private DataModel items = null;
    @EJB
    private FacadePK.PersonnelLangFacade ejbFacade;
    @EJB
    private FacadePK.PersonnelFacade ejbFacadeprs;
    @EJB
    private FacadePK.LangFacade ejbFacadeLang;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    private List<PersonnelLang> Personnels = new ArrayList();
    private List<PersonnelLang> FiltredPersonnels;
    private PersonnelLang selectedPersonnellang;
    private Personnel pesonnel;
    private String nomfr;
    private String nomar;
    private String prenomfr;
    private String prenomar;

    public String getNomfr() {
        return nomfr;
    }

    public void setNomfr(String nomfr) {
        this.nomfr = nomfr;
    }

    public String getNomar() {
        return nomar;
    }

    public void setNomar(String nomar) {
        this.nomar = nomar;
    }

    public String getPrenomfr() {
        return prenomfr;
    }

    public void setPrenomfr(String prenomfr) {
        this.prenomfr = prenomfr;
    }

    public String getPrenomar() {
        return prenomar;
    }

    public void setPrenomar(String prenomar) {
        this.prenomar = prenomar;
    }
    
    @ManagedProperty(value = "#{personnelController}")
    private PersonnelController perscont;

    public LangFacade getEjbFacadeLang() {
        return ejbFacadeLang;
    }

    public void setEjbFacadeLang(LangFacade ejbFacadeLang) {
        this.ejbFacadeLang = ejbFacadeLang;
    }

    public PersonnelController getPerscont() {
        return perscont;
    }

    public void setPerscont(PersonnelController perscont) {
        this.perscont = perscont;
    }

    public List<PersonnelLang> getFiltredPersonnels() {
        return FiltredPersonnels;
    }

    public void setFiltredPersonnels(List<PersonnelLang> FiltredPersonnels) {
        this.FiltredPersonnels = FiltredPersonnels;
    }

    public PersonnelLang getCurrentfr() {
        return currentfr;
    }

    public void setCurrentfr(PersonnelLang currentfr) {
        this.currentfr = currentfr;
    }

    public PersonnelLang getCurrentar() {
        return currentar;
    }

    public void setCurrentar(PersonnelLang currentar) {
        this.currentar = currentar;
    }

    public Personnel getPesonnel() {
        
        return pesonnel;
    }

    public void setPesonnel(Personnel pesonnel) {
        this.pesonnel = pesonnel;
    }

    public PersonnelFacade getEjbFacadeprs() {
        return ejbFacadeprs;
    }

    public void setEjbFacadeprs(PersonnelFacade ejbFacadeprs) {
        this.ejbFacadeprs = ejbFacadeprs;
    }

    public PersonnelLang getSelectedPersonnellang() {
        return selectedPersonnellang;
    }

    public void setSelectedPersonnellang(PersonnelLang selectedPersonnellang) {
        this.selectedPersonnellang = selectedPersonnellang;
    }

    public List<PersonnelLang> getPersonnels() {
        Personnels = new ArrayList();
        Personnels = ejbFacade.findAll();
        return Personnels;
    }

    public void setPersonnels(List<PersonnelLang> Personnels) {
        this.Personnels = Personnels;
    }

    public PersonnelLangController() {
    }

    public PersonnelLang getSelected() {
        if (current == null) {
            current = new PersonnelLang();
            selectedItemIndex = -1;
        }
        return current;
    }

    private PersonnelLangFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {
                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (PersonnelLang) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            //getFacade().create(current);
            currentar= new PersonnelLang();
            currentfr= new PersonnelLang();
            currentar.setIdpersonnelLang((pesonnel.getIdpersonnel()) * 2);
            currentfr.setIdpersonnelLang((pesonnel.getIdpersonnel()) * 3);
            currentar.setPersonnelIdpersonnel(pesonnel);
            currentfr.setPersonnelIdpersonnel(pesonnel);
            currentfr.setLangIdlang(ejbFacadeLang.find(2));
            currentar.setLangIdlang(ejbFacadeLang.find(1));
            currentfr.setNom(nomfr);
            currentfr.setPrenom(prenomfr);
            currentar.setNom(nomar);
            currentar.setPrenom(prenomar);
            getFacade().create(currentfr);
            getFacade().create(currentar);
            currentar= new PersonnelLang();
            currentfr= new PersonnelLang();
            
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonnelLangCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String createpers() {
        try {
            
         
            pesonnel=perscont.getSelected();
            perscont.create();
            String s=create();
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonnelCreated"));
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (PersonnelLang) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonnelLangUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        try {

            ejbFacadeprs.remove(ejbFacadeprs.find(selectedPersonnellang.getPersonnelIdpersonnel().getIdpersonnel()));
            //getFacade().remove(this.selectedPersonnellang);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonnelLangDeleted"));
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonnelLangDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    @FacesConverter(forClass = PersonnelLang.class)
    public static class PersonnelLangControllerConverter implements Converter {

        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PersonnelLangController controller = (PersonnelLangController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "personnelLangController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuffer sb = new StringBuffer();
            sb.append(value);
            return sb.toString();
        }

        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof PersonnelLang) {
                PersonnelLang o = (PersonnelLang) object;
                return getStringKey(o.getIdpersonnelLang());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + PersonnelLang.class.getName());
            }
        }
    }
}
