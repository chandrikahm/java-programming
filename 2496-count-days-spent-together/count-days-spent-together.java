class Solution {
        public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
                int aliceArrival = calculateDayOfYear(arriveAlice);
                        int aliceLeave = calculateDayOfYear(leaveAlice);
                                int bobArrival = calculateDayOfYear(arriveBob);
                                        int bobLeave = calculateDayOfYear(leaveBob);

                                                // Find the latest arrival and the earliest leave
                                                        int startOverlap = Math.max(aliceArrival, bobArrival);
                                                                int endOverlap = Math.min(aliceLeave, bobLeave);

                                                                        // If startOverlap <= endOverlap, they overlap
                                                                                if (startOverlap <= endOverlap) {
                                                                                            return endOverlap - startOverlap + 1;
                                                                                                    }
                                                                                                            
                                                                                                                    return 0;
                                                                                                                        }

                                                                                                                            private int calculateDayOfYear(String date) {
                                                                                                                                    int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                                                                                                                                            
                                                                                                                                                    int month = Integer.parseInt(date.substring(0, 2));
                                                                                                                                                            int day = Integer.parseInt(date.substring(3, 5));
                                                                                                                                                                    
                                                                                                                                                                            int dayOfYear = 0;
                                                                                                                                                                                    for (int i = 0; i < month - 1; i++) {
                                                                                                                                                                                                dayOfYear += daysInMonths[i];
                                                                                                                                                                                                        }
                                                                                                                                                                                                                dayOfYear += day;
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                return dayOfYear;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    }
