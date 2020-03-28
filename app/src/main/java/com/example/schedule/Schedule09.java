package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.constitutionofindia.R;

public class Schedule09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule09);

        setTitle("Schedule 09");

        TextView textView = findViewById(R.id.content);

        textView.setText("NINTH SCHEDULE\n" +
                "(Article 31B)\n" +
                "1. The Bihar Land Reforms Act, 1950 (Bihar Act XXX of 1950).\n" +
                "2. The Bombay Tenancy and Agricultural Lands Act, 1948 (Bombay Act LXVII of 1948).\n" +
                "3. The Bombay Maleki Tenure Abolition Act, 1949 (Bombay Act LXI of 1949).\n" +
                "4. The Bombay Taluqdari Tenure Abolition Act, 1949 (Bombay Act LXII of 1949).\n" +
                "5. The Panch Mahals Mehwassi Tenure Abolition Act, 1949 (Bombay Act LXIII of 1949).\n" +
                "6. The Bombay Khoti Abolition Act, 1950 (Bombay Act VI of 1950).\n" +
                "7. The Bombay Paragana and Kulkarni Watan Abolition Act, 1950 (Bombay Act LX of 1950).\n" +
                "8. The Madhya Pradesh Abolition of Proprietary Rights (Estates, Mahals, Alienated Lands) Act, 1950 (Madhya Pradesh Act I of 1951).\n" +
                "9. The Madras Estates (Abolition and Conversion into Ryotwari) Act, 1948 (Madras Act XXVI of 1948).\n" +
                "10. The Madras Estates (Abolition and Conversion into Ryotwari) Amendment Act, 1950 (Madras Act I of 1950).\n" +
                "11. The Uttar Pradesh Zamindari Abolition and Land Reforms Act, 1950 (Uttar Pradesh Act I of 1951).\n" +
                "12. The Hyderabad (Abolition of Jagirs) Regulation, 1358F (No. LXIX of 1358, Fasli).\n" +
                "13. The Hyderabad Jagirs (Commutation) Regulation, 1359F (No. XXV of 1359, Fasli).\n" +
                "14. The Bihar Displaced Persons Rehabilitation (Acquisition of Land) Act, 1950 (Bihar Act XXXVIII of 1950).\n" +
                "15. The United Provinces Land Acquisition (Rehabilitation of Refugees) Act, 1948 (U.P. Act XXVI of 1948).\n" +
                "16. The Resettlement of Displaced Persons (Land Acquisition) Act, 1948 (Act LX of 1948).\n" +
                "17. Sections 52A to 52G of the Insurance Act, 1938 (Act IV of 1938), as inserted by section 42 of the Insurance (Amendment) Act, 1950 (Act XLVII of 1950).\n" +
                "18. The Railway Companies (Emergency Provisions) Act, 1951 (Act LI of 1951).\n" +
                "19. Chapter III-A of the Industries (Development and Regulation) Act, 1951 (Act LXV of 1951), as inserted by section 13 of the Industries (Development and Regulation) Amendment Act, 1953 (Act XXVI of 1953).\n" +
                "20. The West Bengal Land Development and Planning Act, 1948 (West Bengal Act XXI of 1948), as amended by West Bengal Act XXIX of 1951. \n" +
                "21. The Andhra Pradesh Ceiling on Agricultural Holdings Act, 1961 (Andhra Pradesh Act X of 1961).\n" +
                "22. The Andhra Pradesh (Telangana Area) Tenancy and Agricultural Lands (Validation) Act, 1961 (Andhra Pradesh Act XXI of 1961).\n" +
                "23. The Andhra Pradesh (Telangana Area) Ijara and Kowli Land Cancellation of Irregular Pattas and Abolition of Concessional Assessment Act, 1961 (Andhra Pradesh Act XXXVI of 1961).\n" +
                "24. The Assam State Acquisition of Lands belonging to Religious or Charitable Institution of Public Nature Act, 1959 (Assam Act IX of 1961).\n" +
                "25. The Bihar Land Reforms (Amendment) Act, 1953 (Bihar Act XX of 1954).\n" +
                "26. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) Act, 1961 (Bihar Act XII of 1962), except section 28 of this Act.\n" +
                "27. The Bombay Taluqdari Tenure Abolition (Amendment) Act, 1954 (Bombay Act I of 1955).\n" +
                "28. The Bombay Taluqdari Tenure Abolition (Amendment) Act, 1957 (Bombay Act XVIII of 1958).\n" +
                "29. The Bombay Inams (Kutch Area) Abolition Act, 1958 (Bombay Act XCVIII of 1958).\n" +
                "30. The Bombay Tenancy and Agricultural Lands (Gujarat Amendment) Act, 1960 (Gujarat Act XVI of 1960).\n" +
                "31. The Gujarat Agricultural Lands Ceiling Act, 1960 (Gujarat Act XXVI of 1961).\n" +
                "32. The Sagbara and Mehwassi Estates (Proprietary Rights Abolition, etc.) Regulation, 1962 (Gujarat Regulation I of 1962).\n" +
                "33. The Gujarat Surviving Alienations Abolition Act, 1963 (Gujarat Act XXXIII of 1963), except in so far as this Act relates to an alienation referred to in sub-clause (d) of clause (3) of section 2 thereof.\n" +
                "34. The Maharashtra Agricultural Lands (Ceiling on Holdings) Act, 1961 (Maharashtra Act XXVII of 1961).\n" +
                "35. The Hyderabad Tenancy and Agricultural Lands (Re-enactment, Validation and Further Amendment) Act, 1961 (Maharashtra Act XLV of 1961).\n" +
                "36. The Hyderabad Tenancy and Agricultural Lands Act, 1950 (Hyderabad Act XXI of 1950).\n" +
                "37. The Jenmikaram Payment (Abolition) Act, 1960 (Kerala Act III of 1961).\n" +
                "38. The Kerala Land Tax Act, 1961 (Kerala Act XIII of 1961).\n" +
                "39. The Kerala Land Reforms Act, 1963 (Kerala Act I of 1964).\n" +
                "40. The Madhya Pradesh Land Revenue Code, 1959 (Madhya Pradesh Act XX of 1959).\n" +
                "41. The Madhya Pradesh Ceiling on Agricultural Holdings Act, 1960 (Madhya Pradesh Act XX of 1960).\n" +
                "42. The Madras Cultivating Tenants Protection Act, 1955 (Madras Act XXV of 1955).\n" +
                "43. The Madras Cultivating Tenants (Payment of Fair Rent) Act, 1956 (Madras Act XXIV of 1956).\n" +
                "44. The Madras Occupants of Kudiyiruppu (Protection from Eviction) Act, 1961 (Madras Act XXXVIII of 1961).\n" +
                "45. The Madras Public Trusts (Regulation of Administration of Agricultural Lands) Act, 1961 (Madras Act LVII of 1961).\n" +
                "46. The Madras Land Reforms (Fixation of Ceiling on Land) Act, 1961 (Madras Act LVIII of 1961).\n" +
                "47. The Mysore Tenancy Act, 1952 (Mysore Act XIII of 1952). \n" +
                "48. The Coorg Tenants Act, 1957 (Mysore Act XIV of 1957).\n" +
                "49. The Mysore Village Offices Abolition Act, 1961 (Mysore Act XIV of 1961).\n" +
                "50. The Hyderabad Tenancy and Agricultural Lands (Validation) Act, 1961 (Mysore Act XXXVI of 1961).\n" +
                "51. The Mysore Land Reforms Act, 1961 (Mysore Act X of 1962).\n" +
                "52. The Orissa Land Reforms Act, 1960 (Orissa Act XVI of 1960).\n" +
                "53. The Orissa Merged Territories (Village Offices Abolition) Act, 1963 (Orissa Act X of 1963).\n" +
                "54. The Punjab Security of Land Tenures Act, 1953 (Punjab Act X of 1953).\n" +
                "55. The Rajasthan Tenancy Act, 1955 (Rajasthan Act III of 1955).\n" +
                "56. The Rajasthan Zamindari and Biswedari Abolition Act, 1959 (Rajasthan Act VIII of 1959).\n" +
                "57. The Kumaun and Uttarakhand Zamindari Abolition and Land Reforms Act, 1960 (Uttar Pradesh Act XVII of 1960).\n" +
                "58. The Uttar Pradesh Imposition of Ceiling on Land Holdings Act, 1960 (Uttar Pradesh Act I of 1961).\n" +
                "59. The West Bengal Estates Acquisition Act, 1953 (West Bengal Act I of 1954).\n" +
                "60. The West Bengal Land Reforms Act, 1955 (West Bengal Act X of 1956).\n" +
                "61. The Delhi Land Reforms Act, 1954 (Delhi Act VIII of 1954).\n" +
                "62. The Delhi Land Holdings (Ceiling) Act, 1960 (Central Act 24 of 1960).\n" +
                "63. The Manipur Land Revenue and Land Reforms Act, 1960 (Central Act 33 of 1960).\n" +
                "64. The Tripura Land Revenue and Land Reforms Act, 1960 (Central Act 43 of 1960).\n" +
                "65. The Kerala Land Reforms (Amendment) Act, 1969 (Kerala Act 35 of 1969).\n" +
                "66. The Kerala Land Reforms (Amendment) Act, 1971 (Kerala Act 25 of 1971).\n" +
                "67. The Andhra Pradesh Land Reforms (Ceiling on Agricultural Holdings) Act, 1973 (Andhra Pradesh Act 1 of 1973).\n" +
                "68. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1972 (Bihar Act 1 of 1973).\n" +
                "69. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1973 (Bihar Act IX of 1973).\n" +
                "70. The Bihar Land Reforms (Amendment) Act, 1972 (Bihar Act V of 1972).\n" +
                "71. The Gujarat Agricultural Lands Ceiling (Amendment) Act, 1972 (Gujarat Act 2 of 1974).\n" +
                "72. The Haryana Ceiling on Land Holdings Act, 1972 (Haryana Act 26 of 1972).\n" +
                "73. The Himachal Pradesh Ceiling on Land Holdings Act, 1972 (Himachal Pradesh Act 19 of 1973).\n" +
                "74. The Kerala Land Reforms (Amendment) Act, 1972 (Kerala Act 17 of 1972).\n" +
                "75. The Madhya Pradesh Ceiling on Agricultural Holdings (Amendment) Act, 1972 (Madhya Pradesh Act 12 of 1974).\n" +
                "76. The Madhya Pradesh Ceiling on Agricultural Holdings (Second Amendment) Act, 1972 (Madhya Pradesh Act 13 of 1974).\n" +
                "77. The Mysore Land Reforms (Amendment) Act, 1973 (Karnataka Act 1 of 1974).\n" +
                "78. The Punjab Land Reforms Act, 1972 (Punjab Act 10 of 1973).\n" +
                "79. The Rajasthan Imposition of Ceiling on Agricultural Holdings Act, 1973 (Rajasthan Act 11 of 1973).\n" +
                "80. The Gudalur Janmam Estates (Abolition and Conversion into Ryotwari) Act, 1969 (Tamil Nadu Act 24 of 1969).\n" +
                "81. The West Bengal Land Reforms (Amendment) Act, 1972 (West Bengal Act XII of 1972).\n" +
                "82. The West Bengal Estates Acquisition (Amendment) Act, 1964 (West Bengal Act XXII of 1964).\n" +
                "83. The West Bengal Estates Acquisition (Second Amendment) Act, 1973 (West Bengal Act XXXIII of 1973).\n" +
                "84. The Bombay Tenancy and Agricultural Lands (Gujarat Amendment) Act, 1972 (Gujarat Act 5 of 1973).\n" +
                "85. The Orissa Land Reforms (Amendment) Act, 1974 (Orissa Act 9 of 1974).\n" +
                "86. The Tripura Land Revenue and Land Reforms (Second Amendment) Act,1974 (Tripura Act 7 of 1974).\n" +
                "88. The Industries (Development and Regulation) Act, 1951 (Central Act 65 of 1951).\n" +
                "89. The Requisitioning and Acquisition of Immovable Property Act, 1952 (Central Act 30 of 1952).\n" +
                "90. The Mines and Minerals (Regulation and Development) Act, 1957 (Central Act 67 of 1957).\n" +
                "91. The Monopolies and Restrictive Trade Practices Act, 1969 (Central Act 54 of 1969).\n" +
                "93. The Coking Coal Mines (Emergency Provisions) Act, 1971 (Central Act 64 of 1971).\\\n" +
                "94. The Coking Coal Mines (Nationalisation) Act, 1972 (Central Act 36 of 1972).\n" +
                "95. The General Insurance Business (Nationalisation) Act, 1972 (Central Act 57 of 1972).\n" +
                "96. The Indian Copper Corporation (Acquisition of Undertaking) Act, 1972 (Central Act 58 of 1972).\n" +
                "97. The Sick Textile Undertakings (Taking Over of Management) Act, 1972 (Central Act 72 of 1972).\n" +
                "98. The Coal Mines (Taking Over of Management) Act, 1973 (Central Act 15 of 1973).\n" +
                "99. The Coal Mines (Nationalisation) Act, 1973 (Central Act 26 of 1973).\n" +
                "100. The Foreign Exchange Regulation Act, 1973 (Central Act 46 of 1973).\n" +
                "101. The Alcock Ashdown Company Limited (Acquisition of Undertakings) Act, 1973 (Central Act 56 of 1973).\n" +
                "102. The Coal Mines (Conservation and Development) Act, 1974 (Central Act 28 of 1974).\n" +
                "103. The Additional Emoluments (Compulsory Deposit) Act, 1974 (Central Act 37 of 1974).\n" +
                "104. The Conservation of Foreign Exchange and Prevention of Smuggling Activities Act, 1974 (Central Act 52 of 1974).\n" +
                "105. The Sick Textile Undertakings (Nationalisation) Act, 1974 (Central Act 57 of 1974).\n" +
                "106. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1964 (Maharashtra Act XVI of 1965).\n" +
                "107. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1965 (Maharashtra Act XXXII of 1965).\n" +
                "108. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1968 (Maharashtra Act XVI of 1968).\n" +
                "109. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Second Amendment) Act, 1968 (Maharashtra Act XXXIII of 1968).\n" +
                "110. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1969 (Maharashtra Act XXXVII of 1969).\n" +
                "111. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Second Amendment) Act, 1969 (Maharashtra Act XXXVIII of 1969).\n" +
                "112. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1970 (Maharashtra Act XXVII of 1970).\n" +
                "113. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1972 (Maharashtra Act XIII of 1972).\n" +
                "114. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1973 (Maharashtra Act L of 1973).\n" +
                "115. The Orissa Land Reforms (Amendment) Act, 1965 (Orissa Act 13 of 1965).\n" +
                "116. The Orissa Land Reforms (Amendment) Act, 1966 (Orissa Act 8 of 1967).\n" +
                "117. The Orissa Land Reforms (Amendment) Act, 1967 (Orissa Act 13 of 1967).\n" +
                "118. The Orissa Land Reforms (Amendment) Act, 1969 (Orissa Act 13 of 1969).\n" +
                "119. The Orissa Land Reforms (Amendment) Act, 1970 (Orissa Act 18 of 1970).\n" +
                "120. The Uttar Pradesh Imposition of Ceiling on Land Holdings (Amendment) Act, 1972 (Uttar Pradesh Act 18 of 1973).\n" +
                "121. The Uttar Pradesh Imposition of Ceiling on Land Holdings (Amendment) Act, 1974 (Uttar Pradesh Act 2 of 1975).\n" +
                "122. The Tripura Land Revenue and Land Reforms (Third Amendment) Act, 1975 (Tripura Act 3 of 1975).\n" +
                "123.The Dadra and Nagar Haveli Land Reforms Regulation, 1971 (3 of 1971). \n" +
                "124. The Dadra and Nagar Haveli Land Reforms (Amendment) Regulation, 1973 (5 of 1973).\n" +
                "125. Section 66A and Chapter IVA of the Motor Vehicles Act, 1939 (Central Act 4 of 1939) (* See now the relevant provisions of the Motor Vehicles Act, 1988 (59 of 1988)).\n" +
                "126. The Essential Commodities Act, 1955 (Central Act 10 of 1955).\n" +
                "127. The Smugglers and Foreign Exchange Manipulators (Forfeiture of Property) Act, 1976 (Central Act 13 of 1976).\n" +
                "128. The Bonded Labour System (Abolition) Act, 1976 (Central Act 19 of 1976).\n" +
                "129. The Conservation of Foreign Exchange and Prevention of Smuggling Activities (Amendment) Act, 1976 (Central Act 20 of 1976).\n" +
                "131. The Levy Sugar Price Equalisation Fund Act, 1976 (Central Act 31 of 1976).\n" +
                "132. The Urban Land (Ceiling and Regulation) Act, 1976 (Central Act 33 of 1976).\n" +
                "133. The Departmentalisation of Union Accounts (Transfer of Personnel) Act, 1976 (Central Act 59 of 1976).\n" +
                "134. The Assam Fixation of Ceiling on Land Holdings Act, 1956 (Assam Act 1 of 1957).\n" +
                "135. The Bombay Tenancy and Agricultural Lands (Vidarbha Region) Act, 1958 (Bombay Act XCIX of 1958).\n" +
                "136. The Gujarat Private Forests (Acquisition) Act, 1972 (Gujarat Act 14 of 1973).\n" +
                "137. The Haryana Ceiling on Land Holdings (Amendment) Act, 1976 (Haryana Act 17 of 1976).\n" +
                "138. The Himachal Pradesh Tenancy and Land Reforms Act, 1972 (Himachal Pradesh Act 8 of 1974).\n" +
                "139. The Himachal Pradesh Village Common Lands Vesting and Utilization Act, 1974 (Himachal Pradesh Act 18 of 1974).\n" +
                "140. The Karnataka Land Reforms (Second Amendment and Miscellaneous Provisions) Act, 1974 (Karnataka Act 31 of 1974).\n" +
                "141. The Karnataka Land Reforms (Second Amendment) Act, 1976 (Karnataka Act 27 of 1976).\n" +
                "142. The Kerala Prevention of Eviction Act, 1966 (Kerala Act 12 of 1966). \n" +
                "143. The Thiruppuvaram Payment (Abolition) Act, 1969 (Kerala Act 19 of 1969). \n" +
                "144. The Sreepadam Lands Enfranchisement Act, 1969 (Kerala Act 20 of 1969).\n" +
                "145. The Sree Pandaravaka Lands (Vesting and Enfranchisement) Act, 1971 (Kerala Act 20 of 1971).\n" +
                "146. The Kerala Private Forests (Vesting and Assignment) Act, 1971 (Kerala Act 26 of 1971).\n" +
                "147. The Kerala Agricultural Workers Act, 1974 (Kerala Act 18 of 1974). \n" +
                "148. The Kerala Cashew Factories (Acquisition) Act, 1974 (Kerala Act 29 of 1974).\n" +
                "149. The Kerala Chitties Act, 1975 (Kerala Act 23 of 1975).\n" +
                "150. The Kerala Scheduled Tribes (Restriction on Transfer of Lands and Restoration of Alienated Lands) Act, 1975 (Kerala Act 31 of 1975).\n" +
                "151. The Kerala Land Reforms (Amendment) Act, 1976 (Kerala Act 15 of 1976).\n" +
                "152. The Kanam Tenancy Abolition Act, 1976 (Kerala Act 16 of 1976). \n" +
                "153. The Madhya Pradesh Ceiling on Agricultural Holdings (Amendment) Act, 1974 (Madhya Pradesh Act 20 of 1974).\n" +
                "154. The Madhya Pradesh Ceiling on Agricultural Holdings (Amendment) Act, 1975 (Madhya Pradesh Act 2 of 1976).\n" +
                "155. The West Khandesh Mehwassi Estates (Proprietary Rights Abolition, etc.) Regulation, 1961 (Maharashtra Regulation 1 of 1962).\n" +
                "156. The Maharashtra Restoration of Lands to Scheduled Tribes Act, 1974 (Maharashtra Act XIV of 1975).\n" +
                "157. The Maharashtra Agricultural Lands (Lowering of Ceiling on Holdings) and (Amendment) Act, 1972 (Maharashtra Act XXI of 1975).\n" +
                "158. The Maharashtra Private Forest (Acquisition) Act, 1975 (Maharashtra Act XXIX of 1975).\n" +
                "159. The Maharashtra Agricultural Lands (Lowering of Ceiling on Holdings) and (Amendment) Amendment Act, 1975 (Maharashtra Act XLVII of 1975).\n" +
                "160. The Maharashtra Agricultural Lands (Ceiling on Holdings) (Amendment) Act, 1975 (Maharashtra Act II of 1976).\n" +
                "161. The Orissa Estates Abolition Act, 1951 (Orissa Act I of 1952).\n" +
                "162. The Rajasthan Colonisation Act, 1954 (Rajasthan Act XXVII of 1954).\n" +
                "163. The Rajasthan Land Reforms and Acquisition of Landowners Estates Act, 1963 (Rajasthan Act 11 of 1964).\n" +
                "164. The Rajasthan Imposition of Ceiling on Agricultural Holdings (Amendment) Act, 1976 (Rajasthan Act 8 of 1976).\n" +
                "165. The Rajasthan Tenancy (Amendment) Act, 1976 (Rajasthan Act 12 of 1976).\n" +
                "166. The Tamil Nadu Land Reforms (Reduction of Ceiling on Land) Act, 1970 (Tamil Nadu Act 17 of 1970).\n" +
                "167. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1971 (Tamil Nadu Act 41 of 1971).\n" +
                "168. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1972 (Tamil Nadu Act 10 of 1972).\n" +
                "169. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1972 (Tamil Nadu Act 20 of 1972).\n" +
                "170. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Third Amendment Act, 1972 (Tamil Nadu Act 37 of 1972).\n" +
                "171. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Fourth Amendment Act, 1972 (Tamil Nadu Act 39 of 1972).\n" +
                "172. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Sixth Amendment Act, 1972 (Tamil Nadu Act 7 of 1974).\n" +
                "173. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Fifth Amendment Act, 1972 (Tamil Nadu Act 10 of 1974).\n" +
                "174. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1974 (Tamil Nadu Act 15 of 1974).\n" +
                "175. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Third Amendment Act, 1974 (Tamil Nadu Act 30 of 1974).\n" +
                "176. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1974 (Tamil Nadu Act 32 of 1974).\n" +
                "177. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1975 (Tamil Nadu Act 11 of 1975).\n" +
                "178. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1975 (Tamil Nadu Act 21 of 1975).\n" +
                "179. Amendments made to the Uttar Pradesh Zamindari Abolition and Land Reforms Act, 1950 (Uttar Pradesh Act I of 1951) by the Uttar Pradesh Land Laws (Amendment) Act, 1971 (Uttar Pradesh Act 21 of 1971) and the Uttar Pradesh Land Laws (Amendment) Act, 1974 (Uttar Pradesh Act 34 of 1974).\n" +
                "180. The Uttar Pradesh Imposition of Ceiling on Land Holdings (Amendment) Act, 1976 (Uttar Pradesh Act 20 of 1976).\n" +
                "181. The West Bengal Land Reforms (Second Amendment) Act, 1972 (West Bengal Act XXVIII of 1972).\n" +
                "182. The West Bengal Restoration of Alienated Land Act, 1973 (West Bengal Act XXIII of 1973).\n" +
                "183. The West Bengal Land Reforms (Amendment) Act, 1974 (West Bengal Act XXXIII of 1974).\n" +
                "184. The West Bengal Land Reforms (Amendment) Act, 1975 (West Bengal Act XXIII of 1975).\n" +
                "185. The West Bengal Land Reforms (Amendment) Act, 1976 (West Bengal Act XII of 1976).\n" +
                "186. The Delhi Land Holdings (Ceiling) Amendment Act, 1976 (Central Act 15 of 1976).\n" +
                "187. The Goa, Daman and Diu Mundkars (Protection from Eviction) Act, 1975 (Goa, Daman and Diu Act 1 of 1976).\n" +
                "188. The Pondicherry Land Reforms (Fixation of Ceiling on Land) Act, 1973 (Pondicherry Act 9 of 1974).\n" +
                "189. The Assam (Temporarily Settled Areas) Tenancy Act, 1971 (Assam Act XXIII of 1971).\n" +
                "190. The Assam (Temporarily Settled Areas) Tenancy (Amendment) Act, 1974 (Assam Act XVIII of 1974).\n" +
                "191. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Amending Act, 1974 (Bihar Act 13 of 1975).\n" +
                "192. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1976 (Bihar Act 22 of 1976). \n" +
                "193. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1978 (Bihar Act VII of 1978).\n" +
                "194. The Land Acquisition (Bihar Amendment) Act, 1979 (Bihar Act 2 of 1980).\n" +
                "195. The Haryana Ceiling on Land Holdings (Amendment) Act, 1977 (Haryana Act 14 of 1977).\n" +
                "196. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1978 (Tamil Nadu Act 25 of 1978).\n" +
                "197. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1979 (Tamil Nadu Act 11 of 1979).\n" +
                "198. The Uttar Pradesh Zamindari Abolition Laws (Amendment) Act, 1978 (Uttar Pradesh Act 15 of 1978).\n" +
                "199. The West Bengal Restoration of Alienated Land (Amendment) Act, 1978 (West Bengal Act XXIV of 1978).\n" +
                "200. The West Bengal Restoration of Alienated Land (Amendment) Act, 1980 (West Bengal Act LVI of 1980).\n" +
                "201. The Goa, Daman and Diu Agricultural Tenancy Act, 1964 (Goa, Daman and Diu Act 7 of 1964).\n" +
                "202. The Goa, Daman and Diu Agricultural Tenancy (Fifth Amendment) Act, 1976 (Goa, Daman and Diu Act 17 of 1976).\n" +
                "203. The Andhra Pradesh Scheduled Areas Land Transfer Regulation, 1959 (Andhra Pradesh Regulation 1 of 1959).\n" +
                "204. The Andhra Pradesh Scheduled Areas Laws (Extension and Amendment) Regulation, 1963 (Andhra Pradesh Regulation 2 of 1963).\n" +
                "205. The Andhra Pradesh Scheduled Areas Land Transfer (Amendment) Regulation, 1970 (Andhra Pradesh Regulation 1 of 1970).\n" +
                "206. The Andhra Pradesh Scheduled Areas Land Transfer (Amendment) Regulation, 1971 (Andhra Pradesh Regulation 1 of 1971).\n" +
                "207. The Andhra Pradesh Scheduled Areas Land Transfer (Amendment) Regulation, 1978 (Andhra Pradesh Regulation 1 of 1978).\n" +
                "208. The Bihar Tenancy Act, 1885 (Bihar Act 8 of 1885). 209. The Chota Nagpur Tenancy Act, 1908 (Bengal Act 6 of 1908)\n" +
                "Chapter VIIIsections 46, 47, 48, 48A and 49; Chapter X sections 71, 71A and 71B; and Chapter XVIIIsections 240, 241 and 242).\n" +
                "210. The Santhal Parganas Tenancy (Supplementary Provisions) Act, 1949 (Bihar Act 14 of 1949) except section 53.\n" +
                "211. The Bihar Scheduled Areas Regulation, 1969 (Bihar Regulation 1 of 1969).\n" +
                "212. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1982 (Bihar Act 55 of 1982).\n" +
                "213. The Gujarat Devasthan Inams Abolition Act, 1969 (Gujarat Act 16 of 1969).\n" +
                "214. The Gujarat Tenancy Laws (Amendment) Act, 1976 (Gujarat Act 37 of 1976).\n" +
                "215. The Gujarat Agricultural Lands Ceiling (Amendment) Act, 1976 (President's Act 43 of 1976).\n" +
                "216. The Gujarat Devasthan Inams Abolition (Amendment) Act, 1977 (Gujarat Act 27 of 1977).\n" +
                "217. The Gujarat Tenancy Laws (Amendment) Act, 1977 (Gujarat Act 30 of 1977).\n" +
                "218. The Bombay Land Revenue (Gujarat Second Amendment) Act, 1980 (Gujarat Act 37 of 1980).\n" +
                "219. The Bombay Land Revenue Code and Land Tenure Abolition Laws (Gujarat Amendment) Act, 1982 (Gujarat Act 8 of 1982).\n" +
                "220. The Himachal Pradesh Transfer of Land (Regulation) Act, 1968 (Himachal Pradesh Act 15 of 1969).\n" +
                "221. The Himachal Pradesh Transfer of Land (Regulation) (Amendment) Act, 1986 (Himachal Pradesh Act 16 of 1986).\n" +
                "222. The Karnataka Scheduled Castes and Scheduled Tribes (Prohibition of Transfer of Certain Lands) Act, 1978 (Karnataka Act 2 of 1979).\n" +
                "223. The Kerala Land Reforms (Amendment) Act, 1978 (Kerala Act 13 of 1978). \n" +
                "224. The Kerala Land Reforms (Amendment) Act, 1981 (Kerala Act 19 of 1981).\n" +
                "225. The Madhya Pradesh Land Revenue Code (Third Amendment) Act, 1976 (Madhya Pradesh Act 61 of 1976).\n" +
                "226. The Madhya Pradesh Land Revenue Code (Amendment) Act, 1980 (Madhya Pradesh Act 15 of 1980).\n" +
                "227. The Madhya Pradesh Akrishik Jot Uchchatam Seema Adhiniyam, 1981 (Madhya Pradesh Act 11 of 1981).\n" +
                "228. The Madhya Pradesh Ceiling on Agricultural Holdings (Second Amendment) Act, 1976 (Madhya Pradesh Act 1 of 1984).\n" +
                "229. The Madhya Pradesh Ceiling on Agricultural Holdings (Amendment) Act, 1984 (Madhya Pradesh Act 14 of 1984).\n" +
                "230. The Madhya Pradesh Ceiling on Agricultural Holdings (Amendment) Act, 1989 (Madhya Pradesh Act 8 of 1989).\n" +
                "231. The Maharashtra Land Revenue Code, 1966 (Maharashtra Act 41 of 1966), sections 36, 36A and 36B.\n" +
                "232. The Maharashtra Land Revenue Code and the Maharashtra Restoration of Lands to Scheduled Tribes (Second Amendment) Act, 1976 (Maharashtra Act 30 of 1977).\n" +
                "233. The Maharashtra Abolition of Subsisting Proprietary Rights to Mines and Minerals in certain Lands Act, 1985 (Maharashtra Act 16 of 1985).\n" +
                "234. The Orissa Scheduled Areas Transfer of Immovable Property (by Scheduled Tribes) Regulation, 1956 (Orissa Regulation 2 of 1956).\n" +
                "235. The Orissa Land Reforms (Second Amendment) Act, 1975 (Orissa Act 29 of 1976).\n" +
                "236. The Orissa Land Reforms (Amendment) Act, 1976 (Orissa Act 30 of 1976).\n" +
                "237. The Orissa Land Reforms (Second Amendment) Act, 1976 (Orissa Act 44 of 1976).\n" +
                "238. The Rajasthan Colonisation (Amendment) Act, 1984 (Rajasthan Act 12 of 1984).\n" +
                "239. The Rajasthan Tenancy (Amendment) Act, 1984 (Rajasthan Act 13 of 1984).\n" +
                "240. The Rajasthan Tenancy (Amendment) Act, 1987 (Rajasthan Act 21 of 1987).\n" +
                "241. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1979 (Tamil Nadu Act 8 of 1980).\n" +
                "242. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1980 (Tamil Nadu Act 21 of 1980).\n" +
                "243. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1981 (Tamil Nadu Act 59 of 1981).\n" +
                "244. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1983 (Tamil Nadu Act 2 of 1984).\n" +
                "245. The Uttar Pradesh Land Laws (Amendment) Act, 1982 (Uttar Pradesh Act 20 of 1982).\n" +
                "246. The West Bengal Land Reforms (Amendment) Act, 1965 (West Bengal Act 18 of 1965).\n" +
                "247. The West Bengal Land Reforms (Amendment) Act, 1966 (West Bengal Act 11 of 1966).\n" +
                "248. The West Bengal Land Reforms (Second Amendment) Act, 1969 (West Bengal Act 23 of 1969).\n" +
                "249. The West Bengal Estate Acquisition (Amendment) Act, 1977 (West Bengal Act 36 of 1977).\n" +
                "250. The West Bengal Land Holding Revenue Act, 1979 (West Bengal Act 44 of 1979).\n" +
                "251. The West Bengal Land Reforms (Amendment) Act, 1980 (West Bengal Act 41 of 1980).\n" +
                "252. The West Bengal Land Holding Revenue (Amendment) Act, 1981 (West Bengal Act 33 of 1981).\n" +
                "253. The Calcutta Thikka Tenancy (Acquisition and Regulation) Act, 1981 (West Bengal Act 37 of 1981). \n" +
                "254. The West Bengal Land Holding Revenue (Amendment) Act, 1982 (West Bengal Act 23 of 1982).\n" +
                "255. The Calcutta Thikka Tenancy (Acquisition and Regulation) (Amendment) Act, 1984 (West Bengal Act 41 of 1984).\n" +
                "256. The Mahe Land Reforms Act, 1968 (Pondicherry Act 1 of 1968). \n" +
                "257. The Mahe Land Reforms (Amendment) Act, 1980 (Pondicherry Act 1 of 1981). \n" +
                "257A. The Tamil Nadu Backward Classes, Scheduled Castes and Scheduled Tribes (Reservation of Seats in Educational Institutions and of appointments or posts in the Services under the State) Act, 1993 (Tamil Nadu Act 45 of 1994).]\n" +
                "258. The Bihar Privileged Persons Homestead Tenancy Act, 1947 (Bihar Act 4 of 1948).\n" +
                "259. The Bihar Consolidation of Holdings and Prevention of Fragmentation Act, 1956 (Bihar Act 22 of 1956).\n" +
                "260. The Bihar Consolidation of Holdings and Prevention of Fragmentation (Amendment) Act, 1970 (Bihar Act 7 of 1970).\n" +
                "261. The Bihar Privileged Persons Homestead Tenancy (Amendment) Act, 1970 (Bihar Act 9 of 1970).\n" +
                "262. The Bihar Consolidation of Holdings and Prevention of Fragmentation (Amendment) Act, 1973 (Bihar Act 27 of 1975).\n" +
                "263. The Bihar Consolidation of Holdings and Prevention of Fragmentation (Amendment) Act, 1981 (Bihar Act 35 of 1982).\n" +
                "264. The Bihar Land Reforms (Fixation of Ceiling Area and Acquisition of Surplus Land) (Amendment) Act, 1987 (Bihar Act 21 of 1987).\n" +
                "265. The Bihar Privileged Persons Homestead Tenancy (Amendment) Act, 1989 (Bihar Act 11 of 1989).\n" +
                "266. The Bihar Land Reforms (Amendment) Act, 1989 (Bihar Act 11 of 1990). \n" +
                "267. The Karnataka Scheduled Castes and Scheduled Tribes (Prohibition of Transfer of Certain Lands) (Amendment) Act, 1984 (Karnataka Act 3 of 1984).\n" +
                "268. The Kerala Land Reforms (Amendment) Act, 1989 (Kerala Act 16 of 1989). \n" +
                "269. The Kerala Land Reforms (Second Amendment) Act, 1989 (Kerala Act 2 of 1990).\n" +
                "270. The Orissa Land Reforms (Amendment) Act, 1989 (Orissa Act 9 of 1990).\n" +
                "271. The Rajasthan Tenancy (Amendment) Act, 1979 (Rajasthan Act 16 of 1979).\n" +
                "272. The Rajasthan Colonisation (Amendment) Act, 1987 (Rajasthan Act 2 of 1987).\n" +
                "273. The Rajasthan Colonisation (Amendment) Act, 1989 (Rajasthan Act 12 of 1989).\n" +
                "274. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1983 (Tamil Nadu Act 3 of 1984).\n" +
                "275. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment Act, 1986 (Tamil Nadu Act 57 of 1986).\n" +
                "276. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Second Amendment Act, 1987 (Tamil Nadu Act 4 of 1988).\n" +
                "277. The Tamil Nadu Land Reforms (Fixation of Ceiling on Land) Amendment (Amendment) Act, 1989 (Tamil Nadu Act 30 of 1989).\n" +
                "278. The West Bengal Land Reforms (Amendment) Act, 1981 (West Bengal Act 50 of 1981).\n" +
                "279. The West Bengal Land Reforms (Amendment) Act, 1986 (West Bengal Act 5 of 1986).\n" +
                "280. The West Bengal Land Reforms (Second Amendment) Act, 1986 (West Bengal Act 19 of 1986).\n" +
                "281. The West Bengal Land Reforms (Third Amendment) Act, 1986 (West Bengal Act 35 of 1986).\n" +
                "282. The West Bengal Land Reforms (Amendment) Act, 1989 (West Bengal Act 23 of 1989).\n" +
                "283. The West Bengal Land Reforms (Amendment) Act, 1990 (West Bengal Act 24 of 1990).\n" +
                "284. The West Bengal Land Reforms Tribunal Act, 1991 (West Bengal Act 12 of 1991).\n" +
                "Explanation. Any acquisition made under the Rajasthan Tenancy Act, 1955 (Rajasthan Act III of 1955), in contravention of the second proviso to clause (1) of article 31A shall, to the extent of the contravention, be void.");
    }
}
