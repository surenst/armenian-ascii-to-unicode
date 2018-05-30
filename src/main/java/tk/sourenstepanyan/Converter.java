package tk.sourenstepanyan;

import java.util.Arrays;
import java.util.List;

/**
 * One-way converting from Armenian ASCII to UNICODE
 *
 * @author <a href="mailto:sourenstepanyan@gmail.com">Souren Stepanyan</a>
 */
public class Converter {
    /**
     * List with ascii values of the Armenian alphabet
     */
    private static List<Integer> asciiList = Arrays.asList(171, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188,
            189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209,
            210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230,
            231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251,
            252, 253, 167, 166, 175, 170, 177, 176, 163, 58, 172, 173, 169, 168);
    /**
     * List with unicode values of the Armenian alphabet
     */
    private static List<Integer> utf8List = Arrays.asList(44, 1329, 1377, 1330, 1378, 1331, 1379, 1332, 1380, 1333, 1381,
            1334, 1382, 1335, 1383, 1336, 1384, 1337, 1385, 1338, 1386, 1339, 1387, 1340, 1388, 1341, 1389, 1342, 1390,
            1343, 1391, 1344, 1392, 1345, 1393, 1346, 1394, 1347, 1395, 1348, 1396, 1349, 1397, 1350, 1398, 1351, 1399,
            1352, 1400, 1353, 1401, 1354, 1402, 1355, 1403, 1356, 1404, 1357, 1405, 1358, 1406, 1359, 1407, 1360, 1408,
            1361, 1409, 1362, 1410, 1363, 1411, 1364, 1412, 1365, 1413, 1366, 1414, 171, 187, 1372, 1373, 1374, 1371, 1417,
            1417, 45, 1418, 46, 1415);

    /**
     * Method divide string into independent characters and calls {@link Converter#getUTF8(char)}.
     *
     * @param ascii {@link String} in ASCII
     * @return {@link String} Unicode
     */
    public static String asciiToUTF8(String ascii){
        StringBuilder sum = new StringBuilder();
        char[] asciiArr = ascii.toCharArray();

        for(int i=0; i<=asciiArr.length-1; i++){
            sum.append(getUTF8(asciiArr[i]));
        }
        return sum.toString();
    }

    /**
     * Searching provided character in ASCII list.
     * If character by value is exist in the list,
     * returns appropriate character from Unicode list by index.
     *
     * Otherwise returns the same character.
     *
     * @param ch char
     * @return char
     */
    private static char getUTF8(char ch) {
        int index = (int) ch;
        int i=asciiList.indexOf(index);

        if(i<asciiList.size() && i !=-1){
            return (char) utf8List.get(i).intValue();
        }
        return ch;
    }
}
