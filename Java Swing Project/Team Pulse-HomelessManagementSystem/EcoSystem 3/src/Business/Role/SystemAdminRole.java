/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,HomelessDirectory homelessdirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
