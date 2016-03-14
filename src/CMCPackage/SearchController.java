package CMCPackage;
/**
 * 
 */
/**
 * @author jcblomquist
 *
 */
public class SearchController {
	public String[][] matchingSchools, temp, schoolsInLibrary, recommendedSchools, schoolsWithDistance;
	public String[] schoolString, schoolEmphasis, temporaryString;
	public DatabaseController db;
	public int count, distance, max, min, tempInt;
	public String viewedSchool;
	
	
	public SearchController(){}
	
	// still need to search for the emphasis
	public String[][] search(CharSequence name, CharSequence state, String location, String control, int minNumStudents, int maxNumStudents, int lowPerFemale, int highPerFemale, 
			int lowSatVerbal, int highSatVerbal, int lowSatMath, int highSatMath, int lowExpenses, int highExpenses, int lowPerFinancial, int highPerFinancial,
			int lowNumApplicants, int highNumApplicants, int lowPerAdmitted, int highPerAdmitted, int lowPerEnrolled, int highPerEnrolled,
			int lowAcadScale, int highAcadScale, int lowSocialScale, int highSocialScale, int lowQOLScale, int highQOLScale,
			String emph1, String emph2, String emph3, String emph4, String emph5){
		schoolsInLibrary = db.getSchools();
		count = 0;
		for(int i = 0; i < schoolsInLibrary.length; i++)
			if(schoolsInLibrary[i][0].contains(name) || name == null)
				if(schoolsInLibrary[i][1].contains(state) || state == null)
					if(schoolsInLibrary[i][2] == location || location == null)
						if(schoolsInLibrary[i][3] == control || control == null)
							if(minNumStudents <= Integer.parseInt(schoolsInLibrary[i][4]) && Integer.parseInt(schoolsInLibrary[i][4]) <= maxNumStudents || 
							minNumStudents <= Integer.parseInt(schoolsInLibrary[i][4]) && maxNumStudents == -1 ||
							maxNumStudents >= Integer.parseInt(schoolsInLibrary[i][4]) && minNumStudents == -1 || 
							minNumStudents == -1 && maxNumStudents == -1)
								if(lowPerFemale <= Integer.parseInt(schoolsInLibrary[i][5]) && Integer.parseInt(schoolsInLibrary[i][5]) <= highPerFemale || 
								lowPerFemale <= Integer.parseInt(schoolsInLibrary[i][5]) && highPerFemale == -1 ||
								highPerFemale >= Integer.parseInt(schoolsInLibrary[i][5]) && lowPerFemale == -1 || 
								lowPerFemale == -1 && highPerFemale == -1)
									if(lowSatVerbal <= Integer.parseInt(schoolsInLibrary[i][6]) && Integer.parseInt(schoolsInLibrary[i][6]) <= highSatVerbal || 
									lowSatVerbal <= Integer.parseInt(schoolsInLibrary[i][6]) && highSatVerbal == -1 ||
									highSatVerbal >= Integer.parseInt(schoolsInLibrary[i][6]) && lowSatVerbal == -1 || 
									lowSatVerbal == -1 && highSatVerbal == -1)
										if(lowSatMath <= Integer.parseInt(schoolsInLibrary[i][7]) && Integer.parseInt(schoolsInLibrary[i][7]) <= highSatMath || 
										lowSatMath <= Integer.parseInt(schoolsInLibrary[i][7]) && highSatMath == -1 ||
										highSatMath >= Integer.parseInt(schoolsInLibrary[i][7]) && lowSatMath == -1 || 
										lowSatMath == -1 && highSatMath == -1)
											if(lowExpenses <= Integer.parseInt(schoolsInLibrary[i][8]) && Integer.parseInt(schoolsInLibrary[i][8]) <= highExpenses || 
											lowExpenses <= Integer.parseInt(schoolsInLibrary[i][8]) && highExpenses == -1 ||
											highExpenses >= Integer.parseInt(schoolsInLibrary[i][8]) && lowExpenses == -1 || 
											lowExpenses == -1 && highExpenses == -1)
												if(lowPerFinancial <= Integer.parseInt(schoolsInLibrary[i][9]) && Integer.parseInt(schoolsInLibrary[i][9]) <= highPerFinancial || 
												lowPerFinancial <= Integer.parseInt(schoolsInLibrary[i][9]) && highPerFinancial == -1 ||
												highPerFinancial >= Integer.parseInt(schoolsInLibrary[i][9]) && lowPerFinancial == -1 || 
												lowPerFinancial == -1 && highPerFinancial == -1)
													if(lowNumApplicants <= Integer.parseInt(schoolsInLibrary[i][10]) && Integer.parseInt(schoolsInLibrary[i][10]) <= highNumApplicants || 
													lowNumApplicants <= Integer.parseInt(schoolsInLibrary[i][10]) && highNumApplicants == -1 ||
													highNumApplicants >= Integer.parseInt(schoolsInLibrary[i][10]) && lowNumApplicants == -1 || 
													lowNumApplicants == -1 && highNumApplicants == -1)
														if(lowPerAdmitted <= Integer.parseInt(schoolsInLibrary[i][11]) && Integer.parseInt(schoolsInLibrary[i][11]) <= highPerAdmitted || 
														lowPerAdmitted <= Integer.parseInt(schoolsInLibrary[i][11]) && highPerAdmitted == -1 ||
														highPerAdmitted >= Integer.parseInt(schoolsInLibrary[i][11]) && lowPerAdmitted == -1 || 
														lowPerAdmitted == -1 && highPerAdmitted == -1)
															if(lowPerEnrolled <= Integer.parseInt(schoolsInLibrary[i][12]) && Integer.parseInt(schoolsInLibrary[i][12]) <= highPerEnrolled || 
															lowPerEnrolled <= Integer.parseInt(schoolsInLibrary[i][12]) && highPerEnrolled == -1 ||
															highPerEnrolled >= Integer.parseInt(schoolsInLibrary[i][12]) && lowPerEnrolled == -1 || 
															lowPerEnrolled == -1 && highPerEnrolled == -1)
																if(lowAcadScale <= Integer.parseInt(schoolsInLibrary[i][13]) && Integer.parseInt(schoolsInLibrary[i][13]) <= highAcadScale || 
																lowAcadScale <= Integer.parseInt(schoolsInLibrary[i][13]) && highAcadScale == -1 ||
																highAcadScale >= Integer.parseInt(schoolsInLibrary[i][13]) && lowAcadScale == -1 || 
																lowAcadScale == -1 && highAcadScale == -1)
																	if(lowSocialScale <= Integer.parseInt(schoolsInLibrary[i][14]) && Integer.parseInt(schoolsInLibrary[i][14]) <= highSocialScale || 
																	lowSocialScale <= Integer.parseInt(schoolsInLibrary[i][14]) && highSocialScale == -1 ||
																	highSocialScale >= Integer.parseInt(schoolsInLibrary[i][14]) && lowSocialScale == -1 || 
																	lowSocialScale == -1 && highSocialScale == -1)
																		if(lowQOLScale <= Integer.parseInt(schoolsInLibrary[i][15]) && Integer.parseInt(schoolsInLibrary[i][15]) <= highQOLScale || 
																		lowQOLScale <= Integer.parseInt(schoolsInLibrary[i][15]) && highQOLScale == -1 ||
																		highQOLScale >= Integer.parseInt(schoolsInLibrary[i][15]) && lowQOLScale == -1 || 
																		lowQOLScale == -1 && highQOLScale == -1){
																			temp = matchingSchools;
																			matchingSchools = new String[count+1][18];
																			for(int k = 0; k < count; k++){
																				for(int l = 0; l < 18; l++){
																					matchingSchools[k][l] = temp[k][l];
																				}
																			}
																			for(int j = 0; j < schoolsInLibrary[i].length; j++)
																				matchingSchools[count][j] = schoolsInLibrary[i][i];
																			count++;
																		}								
		return matchingSchools;
		}
	
	//need to figure out how to get max and min of different fields for algorithm (highest and lowest satMath in database, etc.)
	public int getMax(int i){
		schoolsInLibrary = db.getSchools();
		max = Integer.parseInt(schoolsInLibrary[0][i]);
		for(int j = 0; j < schoolsInLibrary.length; j++){
			tempInt = Integer.parseInt(schoolsInLibrary[j][i]);
			if(tempInt > max)
				max = tempInt;
		}
		return max;
		}
	
	public int getMin(int i){
		schoolsInLibrary = db.getSchools();
		min = Integer.parseInt(schoolsInLibrary[0][i]);
		for(int j = 0; j < schoolsInLibrary.length; j++){
			tempInt = Integer.parseInt(schoolsInLibrary[j][i]);
			if(tempInt < max)
				min = tempInt;
		}
		return min;
		}
	
	public String[][] getRecommendedSchools(School s){
		distance = 0;
		schoolsInLibrary = db.getSchools();
		recommendedSchools = new String[5][17];
		schoolString = new String[16];
		schoolsWithDistance = new String[schoolsInLibrary.length][17];
		schoolString[0] = s.getName();
		schoolString[1] = s.getState();
		schoolString[2] = s.getLocation();
		schoolString[3] = s.getControl();
		schoolString[4] = Integer.toString(s.getNumStudents());
		schoolString[5] = Integer.toString(s.getPerFemale());
		schoolString[6] = Integer.toString(s.getSatVerbal());
		schoolString[7] = Integer.toString(s.getSatMath());
		schoolString[8] = Integer.toString(s.getExpenses());
		schoolString[9] = Integer.toString(s.getPerFinancial());
		schoolString[10] = Integer.toString(s.getNumApplicants());
		schoolString[11] = Integer.toString(s.getPerAdmitted());
		schoolString[12] = Integer.toString(s.getPerEnrolled());
		schoolString[13] = Integer.toString(s.getAcadScale());
		schoolString[14] = Integer.toString(s.getSocialScale());
		schoolString[15] = Integer.toString(s.getQOLScale());
		for(int i = 0; i < schoolsInLibrary.length; i++){
			//names will obviously be different, so they are ignored
			if(schoolString[1] != schoolsInLibrary[i][1])
				distance += 1;
			if(schoolString[2] != schoolsInLibrary[i][2])
				distance += 1;
			if(schoolString[3] != schoolsInLibrary[i][3])
				distance += 1;
			for(int j = 4; j < 16; j++){
				distance += (Math.abs(Integer.parseInt(schoolString[j]) - Integer.parseInt(schoolsInLibrary[i][j]))
						/(getMax(j)-getMin(j)));
			}
			for(int k = 0; k < 16; k++){
				schoolsWithDistance[i][k] = schoolsInLibrary[i][k];
			}
			schoolsWithDistance[i][16] = Integer.toString(distance);
			if(i == 0){
				recommendedSchools[0] = schoolsWithDistance[i];
			}
			if(i == 1){
				if(distance < Integer.parseInt(recommendedSchools[0][16])){
					temporaryString = recommendedSchools[0];
					recommendedSchools[0] = schoolsWithDistance[i];
					recommendedSchools[1] = temporaryString;
				}
				else
					recommendedSchools[1] = schoolsWithDistance[i];
			}
			if(i == 2){
				if(distance < Integer.parseInt(recommendedSchools[0][16])){
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = recommendedSchools[0];
					recommendedSchools[0] = schoolsWithDistance[i];	
				}
				else if(distance < Integer.parseInt(recommendedSchools[1][16])){
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = schoolsWithDistance[i];	
				}
				else
					recommendedSchools[2] = schoolsWithDistance[i];		
			}
			if(i == 3){
				if(distance < Integer.parseInt(recommendedSchools[0][16])){
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = recommendedSchools[0];
					recommendedSchools[0] = schoolsWithDistance[i];	
				}
				else if(distance < Integer.parseInt(recommendedSchools[1][16])){
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[2][16])){
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = schoolsWithDistance[i];
				}
				else
					recommendedSchools[3] = schoolsWithDistance[i];	
			}
			if(i == 4){
				if(distance < Integer.parseInt(recommendedSchools[0][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = recommendedSchools[0];
					recommendedSchools[0] = schoolsWithDistance[i];	
				}
				else if(distance < Integer.parseInt(recommendedSchools[1][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[2][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[3][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = schoolsWithDistance[i];
				}
				else
					recommendedSchools[4] = schoolsWithDistance[i];	
			}
			if(i > 4){
				if(distance < Integer.parseInt(recommendedSchools[0][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = recommendedSchools[0];
					recommendedSchools[0] = schoolsWithDistance[i];	
				}
				else if(distance < Integer.parseInt(recommendedSchools[1][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = recommendedSchools[1];
					recommendedSchools[1] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[2][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = recommendedSchools[2];
					recommendedSchools[2] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[3][16])){
					recommendedSchools[4] = recommendedSchools[3];
					recommendedSchools[3] = schoolsWithDistance[i];
				}
				else if(distance < Integer.parseInt(recommendedSchools[4][16])){
					recommendedSchools[4] = schoolsWithDistance[i];
				}
			}
		}
		return recommendedSchools;
	}
		
	}
				
	}