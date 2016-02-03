package xelitexirish.com.easyexaminations.SubjectEnums;

import android.app.Activity;

import xelitexirish.com.easyexaminations.MainActivity;

public class Enums2015 {

    public MainActivity activity;

    public Enums2015(MainActivity activity){
        this.activity = activity;
    }

    public SubjectEnum getEnum(){
        if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.MATHS)) {
            // Maths
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.MATHS20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.MATHS20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.MATHS20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.MATHS20153;
            }

            // English
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ENGLISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ENGLISH20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ENGLISH20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ENGLISH20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ENGLISH20153;
            }
            // Irish
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.IRISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.IRISH20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.IRISH20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.IRISH20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.IRISH20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.FRENCH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.FRENCH20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.FRENCH20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.FRENCH20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.FRENCH20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GERMAN)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GERMAN20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GERMAN20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GERMAN20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GERMAN20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.PHYSICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.PHYSICS20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.PHYSICS20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BIOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BIOLOGY20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BIOLOGY20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.CHEMISTRY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.CHEMISTRY20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.CHEMISTRY20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GEOGRAPHY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GEOGRAPHY20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GEOGRAPHY20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GEOGRAPHY20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GEOGRAPHY20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HISTORY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HISTORY20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HISTORY20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HISTORY20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HISTORY20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ACCOUNTING)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ACCOUNTING20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ACCOUNTING20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ACCOUNTING20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ACCOUNTING20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ECONOMICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ECONOMICS20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ECONOMICS20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ECONOMICS20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ECONOMICS20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BUSINESS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.BUSINESS20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.BUSINESS20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BUSINESS20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BUSINESS20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.TECHNOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.TECHNOLOGY20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.TECHNOLOGY20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.TECHNOLOGY20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.TECHNOLOGY20153;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HOMEEC)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HOMEEC20150;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HOMEEC20151;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HOMEEC20152;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HOMEEC20153;
            }
        }
        return null;
    }
}
