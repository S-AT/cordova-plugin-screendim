//
//  ScreenDim.m
//  ios-cordova
//
//  Created by Andrew Lunny on 12-07-11.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

#import "ScreenDim.h"

@implementation ScreenDim

- (void) enable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options
{	
    [[UIApplication sharedApplication] setIdleTimerDisabled:NO];
    NSLog(@" ScreenDim Plugin: dim enabled");
}


- (void) disable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options 
{   
    [[UIApplication sharedApplication] setIdleTimerDisabled:YES];
    NSLog(@" ScreenDim Plugin: dim disabled");
}

@end
