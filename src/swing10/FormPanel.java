package swing10;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FormPanel extends JPanel {

	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width=200;
		setPreferredSize(dim);
		
		Border inner=BorderFactory.createTitledBorder("Add Person");
		Border outer=BorderFactory.createEmptyBorder();
		setBorder(BorderFactory.createCompoundBorder(inner, outer));
		//setBorder(BorderFactory.createEtchedBorder());
	}
}
