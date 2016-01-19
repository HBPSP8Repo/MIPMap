/*
    Copyright (C) 2007-2011  Database Group - Universita' della Basilicata
    Giansalvatore Mecca - giansalvatore.mecca@unibas.it
    Salvatore Raunich - salrau@gmail.com
    Marcello Buoncristiano - marcello.buoncristiano@yahoo.it

    This file is part of ++Spicy - a Schema Mapping and Data Exchange Tool
    
    ++Spicy is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    ++Spicy is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ++Spicy.  If not, see <http://www.gnu.org/licenses/>.
 */
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.spicygui.vista.wizard;

import it.unibas.spicygui.Costanti;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.openide.WizardDescriptor;

public final class NewMappingTaskVisualPanel2 extends JPanel {

    /** Creates new form NewMappingTaskVisualPanel2 */
    public NewMappingTaskVisualPanel2(WizardDescriptor.Panel newMappingTaskWizardPanel2) {
        initComponents();
        PanelWizardImpl panelWizardImpl = new PanelWizardImpl(Costanti.TARGET, newMappingTaskWizardPanel2);
        this.add(panelWizardImpl, BorderLayout.CENTER);
    }

    @Override
    public String getName() {
        return "Step 2 - " + Costanti.TARGET;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

